package Lab12;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            String input1 = scanner.nextLine();

            System.out.print("Enter second number: ");
            String input2 = scanner.nextLine();


            if (input1 == null || input1.trim().isEmpty() ||
                    input2 == null || input2.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: One or both inputs are null or empty.");
            }

            double num1, num2;

            try {

                num1 = Double.parseDouble(input1);
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Error: Invalid numeric input.");
            }

            System.out.print("Enter operation (+, -, *, /): ");
            String op = scanner.nextLine();

            double result;

            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;

                default:
                    throw new IllegalArgumentException("Error: Invalid operation selected.");
            }

            System.out.println("Result: " + result);

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
