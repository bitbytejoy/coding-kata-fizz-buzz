package com.hextrix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String fizzBuzz (int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Fizz");
        }

        if (number % 5 == 0) {
            result.append("Buzz");
        }

        if (result.length() == 0) {
            result.append(number);
        }

        return result.toString();
    }
}