package Lab08;
interface Payment{
    void processPayment();
}
class CreditCard implements Payment{
    public void processPayment(){
        System.out.println("Payment processed through Credit Card");
    }
}
class PayPal implements Payment{
    public void processPayment(){
        System.out.println("Payment processed through PayPal");
    }
}
class BankTransfer implements Payment{
    public void processPayment(){
        System.out.println("Payment processed through Bank Transfer");
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        CreditCard p1 = new CreditCard();
        PayPal p2 = new PayPal();
        BankTransfer p3 = new BankTransfer();
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
