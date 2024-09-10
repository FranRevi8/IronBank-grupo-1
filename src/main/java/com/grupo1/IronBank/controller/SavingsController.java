package com.grupo1.IronBank.controller;

import com.grupo1.IronBank.service.SavingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/savings")
public class SavingsController {

    @Autowired
    private SavingsService savingsService;
}
