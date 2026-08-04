package Lab05;

import java.util.ArrayList;
import java.util.Collections;

public class Store {
    public static void main(String[] args) {
        ArrayList<Double> orders = new ArrayList<>();
        orders.add(2000.0);
        orders.add(7000.0);
        orders.add(250.0);
        orders.add(500.0);
        orders.add(3000.0);
        orders.add(1500.0);
        orders.add(5500.0);
        orders.add(850.0);

        for(int i=0; i<orders.size(); i++) {
            if(orders.get(i) < 500) {
                System.out.println("Removed Order at Index " + i + " of Value " + orders.get(i));
                orders.remove(i);
                i--;
            }
            else if(orders.get(i) > 5000) {
                System.out.println("Set Discount of 10% to Order at Index " + i + " of Value " + orders.get(i));
                orders.set(i, orders.get(i) * 0.90);
            }
        }

        double sum = 0;
        for(int i=0; i<orders.size(); i++) {
            sum += orders.get(i);
        }
        System.out.println("Total Revenue: " + sum);
        Collections.sort(orders);
        System.out.println("Sorted Order List:");
        System.out.println(orders);
    }
}
