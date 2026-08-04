package Lab2Tasks;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            double subtotal = 0;
            System.out.println("Enter the number of items: ");
            int n = sc.nextInt();
            sc.nextLine();
            String[] items = new String[n];
            double[] prices = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter item name ");
                items[i] = sc.nextLine();
                System.out.println("Enter item price ");
                prices[i] = sc.nextDouble();
                sc.nextLine();
                subtotal += prices[i];
            }
                double discountPercent = 10;
                double discountAmount = subtotal * (discountPercent / 100);
                double totalBeforeTax = subtotal - discountAmount;
                double salesTaxRate = 0.05;
                double salesTax = totalBeforeTax * salesTaxRate;
                double invoiceTotal = totalBeforeTax + salesTax;
                System.out.println("\n--------INVOICE --------");
                System.out.printf("Subtotal ; $%.2f\n", subtotal);
                System.out.println("Discount Percent :" + discountPercent + "%");
                System.out.printf("Discount Amount: $%.2f\n", discountAmount);
                System.out.printf("Total Before Tax: $%.2f\n", totalBeforeTax);
                System.out.printf("Sales Tax: $%.2f\n", salesTax);
                System.out.printf("Invoice Total: $%.2f\n", invoiceTotal);
                System.out.println("---------------------------");

                System.out.println("Continue (Y/N): ");
                choice = sc.next().charAt(0);


            }while (choice != 'Y' &&  choice != 'y') ;
            sc.close();
            System.out.println("Program Terminated.");
    }
    }

