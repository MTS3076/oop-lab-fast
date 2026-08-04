import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double initialBalance ;

    BankAccount(){
        System.out.println("Bank Account Created");
    }

    BankAccount(int accNum, String accHolderName ){
        this.accountNumber= accNum;
        this.accountHolderName = accHolderName;
        this.initialBalance = 0;
    }

    BankAccount(int accNum, String accHolderName , double iniBalance){
        this.accountNumber= accNum;
        this.accountHolderName = accHolderName;
        this.initialBalance = iniBalance;
    }
    void display(){
        System.out.println("Account Number " + accountNumber + " Account Holder Name " + accountHolderName +
                " Initial Balance " + initialBalance);
    }

    public static void main(String[] args) {
         BankAccount account1 = new BankAccount(1009,"TAHA",1000000);
         account1.display();
        BankAccount account2 = new BankAccount(2009,"TAHA");
        account2.display();


    }
    
}
