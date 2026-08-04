package Lab06;
class Account{
    double balance;
}
class SavingsAccount extends Account{

}
class PremiumSavings extends SavingsAccount{
      public void displayInterest(){
          double interest = balance*0.07;
          System.out.println("Final Interest " + (int)interest);
      }
}
public class BankingSystem {
    public static void main(String[] args) {
        PremiumSavings p1 =new PremiumSavings();
        p1.balance=90000;
        p1.displayInterest();

    }
}
