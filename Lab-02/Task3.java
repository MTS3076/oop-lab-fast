package Lab2Tasks;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int num = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(num + " * " + i + "= " + (num*i));
        }
        sc.close();
    }
}
