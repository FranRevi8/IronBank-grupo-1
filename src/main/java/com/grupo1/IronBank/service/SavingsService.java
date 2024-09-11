package com.grupo1.IronBank.service;

import com.grupo1.IronBank.model.Savings;
import com.grupo1.IronBank.repository.SavingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SavingsService {

    @Autowired
    private SavingsRepository savingsRepository;

    public List<Savings> getAllSavings(){return savingsRepository.findAll();}

    public Optional<Savings> getSavingById(Long id){
        return savingsRepository.findById(id);
    }

    public Savings createSavings(Savings savings){
        return savingsRepository.save(savings);
    }

    public boolean deleteSaving(Long id){
        if(savingsRepository.existsById(id)){
            savingsRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Savings> updateSavings(Long id, Savings savings){
        if(savingsRepository.existsById(id)){
            savings.setId(id);
            return Optional.of(savingsRepository.save(savings));
        }
        return Optional.empty();
    }
}
