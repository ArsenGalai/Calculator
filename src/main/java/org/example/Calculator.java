package org.example;

public class Calculator {

    // Метод для додавання двох чисел
    public static int add(int a, int b) {
        return a + b;
    }

    // Метод для віднімання
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Метод для множення
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Метод для ділення з перевіркою на 0
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Ділення на нуль неможливе!");
        }
        return a / b;
    }
}
