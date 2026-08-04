package Lab12;

import java.util.*;

public class AverageCalculator {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("10", "20", "abc", "30", "xyz");

        try {

            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Error: List is null or empty.");
            }

            int sum = 0;
            int count = 0;

            for (String item : list) {
                try {
                    int num = Integer.parseInt(item);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid value: " + item);
                }
            }

            if (count == 0) {
                System.out.println("Error: No valid integers in the list.");
            } else {
                double average = (double) sum / count;
                System.out.println("Average of valid integers: " + average);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
