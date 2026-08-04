package Lab07;

class Ride {
    public void calculateFare(double distance) {
        System.out.println("Generic ride fare: " + distance * 10);
    }
}

class BikeRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 5;
        System.out.println("Bike Ride Fare: " + fare);
    }
}

class CarRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 10;
        System.out.println("Car Ride Fare: " + fare);
    }
}

class LuxuryRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 20;
        System.out.println("Luxury Ride Fare: " + fare);
    }
}

public class RideSharingSystem {
    public static void main(String[] args) {
        Ride r1 = new BikeRide();
        Ride r2 = new CarRide();
        Ride r3 = new LuxuryRide();

        r1.calculateFare(12.5);
        r2.calculateFare(8.3);
        r3.calculateFare(15.0);
    }
}
