package Lab11;

import java.io.*;
        import java.util.ArrayList;
import java.util.Scanner;

public class FileArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            list.add(input);
        }

        String filePath = System.getProperty("user.home") + "/Desktop/data.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            for (String item : list) {
                writer.write(item);
                writer.newLine();
            }

            writer.close();
            System.out.println("Data written to file successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("\nFile deleted successfully!");
        } else {
            System.out.println("\nFailed to delete file.");
        }

        sc.close();
    }
}
