package com.grupo1.IronBank.controller;

import com.grupo1.IronBank.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit-card")
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;
}
