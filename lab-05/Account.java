package Lab05;

public class Account {
    String accountNumber;
    double balance;
    static int totalAccounts;
    static double totalBankBalance;

    Account() {}

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
        totalBankBalance += balance;
    }

    public static void displayBankSummary() {
        System.out.println("Total Number of Bank Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }

    public static void main(String[] args) {
        Account account1 = new Account("ACC101", 15000);
        Account account2 = new Account("ACC102", 20000);
        Account account3 = new Account("ACC103", 18500);

        Account.displayBankSummary();
    }
}
