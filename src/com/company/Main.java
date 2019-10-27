package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");

//      Choose Operation
        Calculation calculationInstance = chooseOperation();

//      Choose Numbers
        int[] numbers = chooseNumbers();

//        Calculate result
        int result = calculate(calculationInstance, numbers);

//       Print result
        System.out.println("Result: " + result);

    }

    //
    private static Calculation chooseOperation() {
        System.out.println("Choose an operation (+,-,*,/):");
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

    private static int[] chooseNumbers() {
//        ask how many numbers
        System.out.println("How many numbers will you be using?");
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();

//        Read numbers
        int[] numbers = new int[numberCount];
        for (int i = 1; i <= numberCount; i++) {
            System.out.println("Enter number " + i);
            numbers[ i - 1] = scanner.nextInt();
        }
        return numbers;
    }

//    Calculate
    private static int calculate(Calculation calculation, int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i <= numbers.length; i++) {
            result = calculation.calculate(result, numbers[i-1]);
        }
        return result;
    }


}








