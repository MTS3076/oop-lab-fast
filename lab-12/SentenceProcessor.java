package Lab12;

import java.util.Scanner;

public class SentenceProcessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence: ");
            String input = scanner.nextLine();


            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Input string is null or empty.");
            }


            String[] words = input.trim().split("\\s+");

            if (words.length < 2) {
                throw new IllegalArgumentException("Error: Sentence must contain at least two words.");
            }

            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }
            
            String result = reversed.toString().trim().toUpperCase();

            System.out.println("Modified sentence: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
