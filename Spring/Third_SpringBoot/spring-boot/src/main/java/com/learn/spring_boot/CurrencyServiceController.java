package com.learn.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("currency-configuration")
public class CurrencyServiceController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping
    public CurrencyServiceConfiguration getSomething(){
        return configuration;
    }
}
