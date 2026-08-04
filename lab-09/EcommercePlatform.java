package Lab09;

abstract class Order {
    abstract void processOrder();
}

interface OnlinePayment {
    void pay();
}

interface CashPayment {
    void pay();
}

class ShoppingOrder extends Order implements OnlinePayment, CashPayment {

    public void processOrder() {
        System.out.println("Order processed.");
    }

    public void onlinePay() {
        System.out.println("Payment done via online method.");
    }

    public void cashPay() {
        System.out.println("Payment done via cash.");
    }

    public void pay() {
        onlinePay();
        cashPay();
    }

    class Invoice {
        void generateInvoice() {
            System.out.println("Invoice generated.");
        }
    }

    public static void main(String[] args) {
        ShoppingOrder o = new ShoppingOrder();

        o.processOrder();
        o.pay();

        ShoppingOrder.Invoice i = o.new Invoice();
        i.generateInvoice();
    }
}
