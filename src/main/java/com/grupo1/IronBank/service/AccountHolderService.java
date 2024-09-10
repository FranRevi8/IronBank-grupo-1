package com.grupo1.IronBank.service;

import com.grupo1.IronBank.repository.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountHolderService {

    @Autowired
    private AccountHolderRepository accountHolderRepository;
}
