package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

    @Override
    public double calculate(String calculator, double a, double b) {

        double total = 0;
        switch (calculator) {
            case "+":
                return  a + b;
            case "-":
                return  a - b;
            case "*":
                return  a * b;
            case "/":
                return  a / b;
        } return total;
    }
}
