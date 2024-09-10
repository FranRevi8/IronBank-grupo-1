package com.grupo1.IronBank.service;

import com.grupo1.IronBank.repository.SavingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingsService {

    @Autowired
    private SavingsRepository savingsRepository;
}
