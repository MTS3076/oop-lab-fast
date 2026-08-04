package Lab09;

interface GPSTracking {
    void trackLocation();
}

interface Payment {
    void makePayment();
}

class Ride implements GPSTracking, Payment {

    public void trackLocation() {
        System.out.println("Tracking ride via GPS...");
    }

    public void makePayment() {
        System.out.println("Processing payment...");
    }

    static class CompanyRules {
        static void showRules() {
            System.out.println("Company Rules: Wear seatbelt, follow traffic laws.");
        }
    }

    public static void main(String[] args) {
        Ride r = new Ride();

        r.trackLocation();
        r.makePayment();

        Ride.CompanyRules.showRules();
    }
}
