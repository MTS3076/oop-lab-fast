package Lab07;

class Restaurant {
    public void calculateDeliveryFee(double distance){
        System.out.println("Generic Delivery fee " + distance*15);
    }
}
class FastFoodRestaurant extends Restaurant{
    @Override
    public void calculateDeliveryFee(double distance){
        System.out.println("Fastfood restaurant Delivery fee " + ((distance*30)-20));
    }
}
class FineDiningRestaurant extends Restaurant{
    @Override
    public void calculateDeliveryFee(double distance){
        System.out.println("Fine dining restaurant Delivery fee " + ((distance*30)+10));
    }
}
class CafeRestaurant extends Restaurant{
    @Override
    public void calculateDeliveryFee(double distance){
        System.out.println("Cafe restaurant Delivery fee " + ((distance*25)*0.80));
    }
}
public class RestaurantSystem{
    public static void main(String[] args) {
    Restaurant r1 = new FastFoodRestaurant();
    Restaurant r2 = new FineDiningRestaurant();
    Restaurant r3 = new CafeRestaurant();
    r1.calculateDeliveryFee(4.7);
    r2.calculateDeliveryFee(2.8);
    r3.calculateDeliveryFee(3.3);
    }
}

