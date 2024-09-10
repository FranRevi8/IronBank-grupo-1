package com.grupo1.IronBank.service;

import com.grupo1.IronBank.dtos.CheckingUpdateDTO;
import com.grupo1.IronBank.model.Checking;
import com.grupo1.IronBank.repository.CheckingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckingService {

    @Autowired
    private CheckingRepository checkingRepository;

    public List<Checking> getAllCheckings(){return checkingRepository.findAll();}

    public Optional<Checking> getCheckingById(Long id){
        return checkingRepository.findById(id);
    }

    public Checking createChecking(Checking checking){
        return checkingRepository.save(checking);
    }

    public boolean deleteChecking(Long id){
        if(checkingRepository.existsById(id)){
            checkingRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Checking> updateChecking(Long id, Checking checking){
        if(checkingRepository.existsById(id)){
            checking.setId(id);
            return Optional.of(checkingRepository.save(checking));
        }
        return Optional.empty();
    }



}
