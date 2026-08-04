package Lab2Tasks;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers ");
        int count = sc.nextInt();
        int esum = 0;
        int osum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter the number ");
            int num = sc.nextInt();
            if (num >= 1 && num <= 100) {
                if (num % 2 == 0) {
                    esum += num;
                } else {
                    osum += num;
                }
            }
            else{
                    System.out.println("Number out of range (1-100),ignored");
                }
            }
        System.out.println("Even Numbers Sum =" + esum);
        System.out.println("Odd Numbers Sum =" + osum);
        sc.close();
    }
}

