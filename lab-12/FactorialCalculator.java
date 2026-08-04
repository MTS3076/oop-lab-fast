package Lab12;

import java.util.Scanner;
import java.math.BigInteger;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Input is null or empty.");
            }

            int n;

            try {
                n = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Error: Input is not a valid integer.");
            }


            if (n < 0) {
                throw new IllegalArgumentException("Error: Factorial is not defined for negative numbers.");
            }

            if (n > 10000) {
                throw new ArithmeticException("Error: Number too large to compute factorial.");
            }

            BigInteger factorial = BigInteger.ONE;

            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Factorial of " + n + " is: " + factorial);

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
