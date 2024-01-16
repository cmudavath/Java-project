package com.example;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello from MainClass!");

        // You can instantiate and use other classes, like Calculator, from here
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println("Result of addition: " + result);
    }
}
