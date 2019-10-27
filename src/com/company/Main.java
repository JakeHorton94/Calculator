package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");


//      Enter numbers
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int FirstNumber = scanner.nextInt();

        System.out.println("Enter Second number");
        int SecondNumber = scanner.nextInt();

//      Choose Operation
        Calculation calculationInstance = chooseOperation();

//      Perform the calculation
        int result = calculationInstance.calculate(FirstNumber, SecondNumber);
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

}

//        print calculation



//        Generate two random numbers
//        Random random = new Random();
//        int FirstNumber = random.nextInt(100);
//        int SecondNumber = random.nextInt(100);
//        System.out.println("First number: " + FirstNumber);
//        System.out.println("Second number: " + SecondNumber);

//        if (operation.equals("+")){
//            result = FirstNumber + SecondNumber;
//        }
//        if (operation.equals("-")){
//            result = FirstNumber - SecondNumber;
//        }
//        if (operation.equals("*")){
//            result = FirstNumber * SecondNumber;
//        }

        //        switch (input) {
//            case "+":
//                result = FirstNumber + SecondNumber;
//                break;
//            case "-":
//                result = FirstNumber - SecondNumber;
//                break;
//            case "*":
//                result = FirstNumber * SecondNumber;
//                break;
//            case "/":
//                result = FirstNumber / SecondNumber;
//            default:
//                throw new IllegalArgumentException("You must enter one of (+,-,*,/)");
//        }








