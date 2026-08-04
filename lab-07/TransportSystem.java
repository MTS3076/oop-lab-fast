package Lab07;



class Transport {
    double baseFare;

    Transport(double baseFare) {
        this.baseFare = baseFare;
    }

    public void fare() {
        System.out.println("Calculating transport fare: " + baseFare);
    }
}


class Bus extends Transport {
    Bus(double baseFare) {
        super(baseFare);
    }

    @Override
    public void fare() {
        double totalFare = baseFare;
        System.out.println("Bus fare: " + totalFare);
    }
}


class Train extends Transport {
    Train(double baseFare) {
        super(baseFare);
    }

    @Override
    public void fare() {
        double totalFare = baseFare * 1.2;
        System.out.println("Train fare: " + totalFare);
    }
}


class Taxi extends Transport {
    double distance; // distance travelled

    Taxi(double baseFare, double distance) {
        super(baseFare);
        this.distance = distance;
    }

    @Override
    public void fare() {
        double totalFare = baseFare + (5 * distance);
        System.out.println("Taxi fare: " + totalFare);
    }
}


public class TransportSystem {
    public static void main(String[] args) {

        Transport t1 = new Bus(50);
        Transport t2 = new Train(80);
        Transport t3 = new Taxi(30, 10);

        t1.fare();
        t2.fare();
        t3.fare();
    }
}
