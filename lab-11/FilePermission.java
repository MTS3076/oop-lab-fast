package Lab11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilePermission {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File file = new File("Confidential.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file");
        }

        System.out.print("Enter designation (Faculty/Student): ");
        String designation = sc.nextLine();

        if (designation.equalsIgnoreCase("Faculty")) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
        } else if (designation.equalsIgnoreCase("Student")) {
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);
        }

        System.out.println("\nAccess Rights:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        sc.close();
    }
}
