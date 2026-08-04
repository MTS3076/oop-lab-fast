package Lab07;

public class Payment {
    public void processPayment(){
        System.out.println("Processing genric payment");
    }
    public static void main(String[] args) {
       Payment p1 = new CreditCard();
       Payment p2 = new DebitCard();
       Payment p3 = new PayPal();
       p1.processPayment();
       p2.processPayment();
       p3.processPayment();
    }
}
class CreditCard extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing payment using credit card");
    }
}
class DebitCard extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing payment using debit card");
    }
}
class PayPal extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing payment using PayPal");
    }
}

