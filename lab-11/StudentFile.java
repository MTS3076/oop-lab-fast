package Lab11;

import java.io.*;
        import java.util.*;

public class StudentFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student full name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PF Lab marks: ");
        int pfLab = sc.nextInt();

        System.out.print("Enter PF Theory marks: ");
        int pfTheory = sc.nextInt();
        sc.nextLine();

        ArrayList<String> courses = new ArrayList<>();

        String[] availableCourses = {"Calculus", "Physics", "English", "ICT", "Islamiat"};

        int totalCredits = 0;

        for (String course : availableCourses) {
            if (totalCredits + 3 <= 15) {
                courses.add(course);
                totalCredits += 3;
            }
        }

        if (pfLab >= 50 && pfTheory >= 50) {
            if (totalCredits + 3 <= 15) {
                courses.add("OOP Lab");
                totalCredits += 3;
            }
            if (totalCredits + 3 <= 15) {
                courses.add("OOP Theory");
                totalCredits += 3;
            }
        }

        String filePath = System.getProperty("user.home") + "/Desktop/" + name.replaceAll(" ", "_") + ".txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            writer.write("Name: " + name);
            writer.newLine();
            writer.write("ID: " + id);
            writer.newLine();
            writer.write("Courses:");
            writer.newLine();

            for (String course : courses) {
                writer.write(course);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file");
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            System.out.println("\nFile Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        sc.close();
    }
}
