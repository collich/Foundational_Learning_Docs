package com.second.learn_another.examples.example1_businesscalc.dataservice;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService){
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
