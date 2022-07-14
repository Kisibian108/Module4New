package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CondimentsServiceImpl implements ICondimentsService{

    @Override
    public String findAll(String [] condiment) {

        String name = "";
        for (String str: condiment) {
            name += str + " ";
        }
        return name;
    }
}
