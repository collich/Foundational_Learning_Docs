package com.second.learn_another.examples.example1_businesscalc.dataservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class MySQLDataService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
    
}
