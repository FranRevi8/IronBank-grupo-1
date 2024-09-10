package com.grupo1.IronBank.service;

import com.grupo1.IronBank.repository.StudentCheckingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCheckingService {

    @Autowired
    private StudentCheckingRepository studentCheckingRepository;
}
