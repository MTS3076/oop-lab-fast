package Lab11;

import java.util.Scanner;

class Login<T, U> {
    private T username;
    private U password;

    public Login(T username, U password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(T inputUser, U inputPass) {
        return username.equals(inputUser) && password.equals(inputPass);
    }
}

public class Main {
    public static void main(String[] args) {

        Login<String, String> system = new Login<>("admin", "12345");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (system.authenticate(user, pass)) {
            System.out.println("Logon successful!");
        } else {
            System.out.println("Invalid credentials. Program terminated.");
            System.exit(0);
        }

        sc.close();
    }
}
