package com.company;

public class Subtract implements Calculation {
    @Override
    public int calculate(int FirstNumber, int SecondNumber) {
        return FirstNumber - SecondNumber;
    }
}
