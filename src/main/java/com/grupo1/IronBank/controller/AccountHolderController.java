package com.grupo1.IronBank.controller;

import com.grupo1.IronBank.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account-holder")
public class AccountHolderController {

    @Autowired
    private AccountHolderService accountHolderService;
}
