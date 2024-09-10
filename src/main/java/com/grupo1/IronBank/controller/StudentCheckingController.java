package com.grupo1.IronBank.controller;

import com.grupo1.IronBank.service.StudentCheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-checking")
public class StudentCheckingController {

    @Autowired
    private StudentCheckingService studentCheckingService;
}
