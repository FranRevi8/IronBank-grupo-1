package com.grupo1.IronBank.service;

import com.grupo1.IronBank.repository.CheckingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckingService {

    @Autowired
    private CheckingRepository checkingRepository;
}
