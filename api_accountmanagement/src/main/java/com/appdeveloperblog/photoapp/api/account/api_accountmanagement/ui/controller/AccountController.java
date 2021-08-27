package com.appdeveloperblog.photoapp.api.account.api_accountmanagement.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping(value="/status/check")
    public String status() {
        return "Working Account Manager";
    }    
}
