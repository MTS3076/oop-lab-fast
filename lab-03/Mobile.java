package Lab03;
import java.util.Scanner;
public class Mobile {
    String BrandName;
    int Model;
    double Price;

    public Mobile() {
        BrandName = "Iphone";
        Model = 1998;
        Price = 70000;
    }

    public Mobile(String bn, int m, double p) {
        BrandName = bn;
        Model = m;
        Price = p;
    }

    void display() {
        System.out.println("Brand Name = " + BrandName);
        System.out.println("Model  = " + Model);
        System.out.println("Price = " + Price);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Brand Name");
        String bn = sc.next();
        System.out.println("Enter the Model");
        int m = sc.nextInt();
        System.out.println("Enter the Price");
        double p = sc.nextDouble();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile(bn,m,p);
        m1.display();
        m2.display();
    }}








