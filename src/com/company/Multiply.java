package com.company;

public class Multiply implements Calculation {
    @Override
    public int calculate(int FirstNumber, int SecondNumber) {
        return FirstNumber * SecondNumber;
    }
}
