package com.company;

public class Add implements Calculation {
    @Override
    public int calculate(int FirstNumber, int SecondNumber) {
        return FirstNumber + SecondNumber;
    }
}
