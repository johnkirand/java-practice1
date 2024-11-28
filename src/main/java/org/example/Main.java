package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to J!");

        TwoNumberCalculator twoNumberCalculator = new TwoNumberCalculator(2,4);
        System.out.println(twoNumberCalculator.sum());
        System.out.println(twoNumberCalculator.difference());
        System.out.println(twoNumberCalculator.division());
        System.out.println(twoNumberCalculator.product());

    }

}