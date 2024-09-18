package com.grupo1.IronBank.service;

import com.grupo1.IronBank.model.Checking;
import com.grupo1.IronBank.model.Transfer;
import com.grupo1.IronBank.repository.CheckingRepository;
import com.grupo1.IronBank.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class TransferService {

    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private CheckingRepository checkingRepository;

    public List<Transfer> getAllTransfers(){return transferRepository.findAll();}

    public Optional<Transfer> getTransferById(Long id){
        return transferRepository.findById(id);
    }

    public Transfer createTransfer(Transfer transfer) {

        Checking originChecking = checkingRepository.findById(transfer.getOriginAccountId())
                .orElseThrow(() -> new RuntimeException("Origin account not found"));
        Checking destinyChecking = checkingRepository.findById(transfer.getDestinyAccountId())
                .orElseThrow(() -> new RuntimeException("Destiny account not found"));

        if (originChecking.getId().equals(destinyChecking.getId())) {
            throw new RuntimeException("Origin and Destiny accounts can not be the same");
        }

        originChecking.getBalance().setAmount(originChecking.getBalance().getAmount().subtract(transfer.getAmount().getAmount()));
        destinyChecking.getBalance().setAmount(destinyChecking.getBalance().getAmount().add(transfer.getAmount().getAmount()));

        if (originChecking.getBalance().getAmount().compareTo(BigDecimal.ZERO) < 0) {

            originChecking.getBalance().setAmount(
                    originChecking.getBalance().getAmount().subtract(originChecking.getPenaltyFee().getAmount())
            );
        }

        checkingRepository.save(originChecking);
        checkingRepository.save(destinyChecking);

        return transferRepository.save(transfer);
    }

}
