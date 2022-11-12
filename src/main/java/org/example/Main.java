package org.example;

import calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        double sum = Calculator.add(1, 2);
        double difference = Calculator.subtract(1, 2);
        double product = Calculator.multiply(1, 2);
        double quotient = Calculator.divide(1, 2);
        double remainder = Calculator.modulo(1, 2);
        double power = Calculator.power(1, 2);

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
        System.out.println("power = " + power);


    }
}