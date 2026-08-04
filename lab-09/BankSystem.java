package Lab09;

interface FraudChecker {
    void checkFraud();
}

interface Auditor {
    void audit();
}

public class BankSystem {
    public static void main(String[] args) {

        FraudChecker fc = new FraudChecker() {
            public void checkFraud() {
                System.out.println("Fraud check in progress...");
            }
        };

        Auditor ad = new Auditor() {
            public void audit() {
                System.out.println("Auditor report generated.");
            }
        };

        fc.checkFraud();
        ad.audit();
    }
}
