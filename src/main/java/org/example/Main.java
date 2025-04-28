package org.example;

public class Main {
    public static void main(String[] args) {

        // Демонстрація додавання
        int sum = Calculator.add(5, 3);
        System.out.println("5 + 3 = " + sum);

        // Демонстрація віднімання
        int difference = Calculator.subtract(10, 4);
        System.out.println("10 - 4 = " + difference);

        // Демонстрація множення
        int product = Calculator.multiply(6, 7);
        System.out.println("6 * 7 = " + product);

        // Демонстрація ділення
        try {
            int quotient = Calculator.divide(20, 4);
            System.out.println("20 / 4 = " + quotient);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка при діленні: " + e.getMessage());
        }

        // Перевірка ділення на 0
        try {
            Calculator.divide(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Очікувана помилка при діленні на 0: " + e.getMessage());
        }
    }
}
