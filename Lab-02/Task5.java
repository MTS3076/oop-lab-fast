package Lab2Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username="taha1234";
        String password="Bop@123";
        double account_balance=50000;
        double withdraw;
        char ch;
        System.out.println("Enter the username");
        String user=sc.next();
        System.out.println("Enter the password");
        String pass=sc.next();
        if(user.equals(username) && pass.equals(password)){
            System.out.println("ACCESS GRANTED ");
            do {
                System.out.println("Main Menu **Welcome to bank of Pakistan**");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Account Status");
                System.out.println("Select your choice:");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Enter the amount to be deposited");
                    int deposit = sc.nextInt();
                    account_balance += deposit;
                    System.out.println("username=" + user);
                    System.out.println("Current Account Balance" + account_balance);
                } else if (choice == 2) {
                    System.out.println("Enter the withdraw amount");
                    withdraw = sc.nextDouble();
                    if (withdraw <= account_balance) {
                        account_balance = account_balance - withdraw;
                        System.out.println(withdraw + " has been withdrawal");
                        System.out.println("New Account Balance=" + account_balance);
                    } else {
                        System.out.println("Insufficient account balance");
                    }
                } else {
                    System.out.println("username=" + user);
                    System.out.println("Current Account Balance= " + account_balance);
                }
                System.out.println("Do you want to continue?[y/Y]");
                ch=sc.next().charAt(0);
            }while(ch =='y' || ch =='Y');

            }else{
            System.out.println("ACCESS DENIED! Invalid Credentials.");

        }
        }
}

