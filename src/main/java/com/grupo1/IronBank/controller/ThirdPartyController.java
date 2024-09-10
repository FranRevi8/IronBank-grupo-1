package com.grupo1.IronBank.controller;

import com.grupo1.IronBank.service.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/third-party")
public class ThirdPartyController {

    @Autowired
    private ThirdPartyService thirdPartyService;
}
