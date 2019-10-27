package com.company;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");

//      Choose Operation
        Calculation calculationInstance = chooseOperation();

//      Choose Numbers
        List<Integer> numbers = chooseNumbers();

//      Calculate result
        int result = calculate(calculationInstance, numbers);

//      Print result
        System.out.println("Result: " + result);

    }

    //
    private static Calculation chooseOperation() {
        System.out.println("Choose an operation (+,-,*):");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();

        switch (operation) {
            case "+":
                return new Add();
            case "-":
                return new Subtract();
            case "*":
                return new Multiply();
            default:
                throw new IllegalArgumentException("You must enter one of (+,-,*)");
        }
    }

    private static List<Integer> chooseNumbers() {
//        Enter numbers
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while(scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
            System.out.println("Enter another number or 'done' to end the calculation");
        }
        return numbers;
    }

    private static int calculate(Calculation calculation, List<Integer> numbers){
        return numbers
                .stream()
                .reduce((a,b) -> calculation.calculate(a,b))
                .get();
    }

}








