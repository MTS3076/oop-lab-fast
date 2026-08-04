
package Lab05;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperatures[][] = new float[5][7];

        System.out.println("Enter Temperatures in Fahrenheit:");
        for(int i=0; i<5; i++) {
            for(int j=0; j<7; j++) {
                System.out.print("Patient " + (i+1) + " | Day " + (j+1) + ": ");
                temperatures[i][j] = sc.nextFloat();
            }
        }

        int countTempExceed = 0;
        for(int i=0; i<5; i++) {
            for(int j=0; j<7; j++) {
                if(temperatures[i][j] > 100) {
                    countTempExceed++;
                }
                if(temperatures[i][j] < 95) {
                    System.out.println("Patient " + (i+1) + " Day " + (j+1) + ": " + temperatures[i][j] + "°F replaced with 95°F (Equipment Correction)");
                    temperatures[i][j] = 95;
                }
            }
        }
        System.out.println("Temperature Exceeded 100F " + countTempExceed + " Times");

        float sum;
        float averageTemp[] = new float[5];
        for(int i=0; i<5; i++) {
            sum = 0;
            averageTemp[i] = 0;
            for(int j=0; j<7; j++) {
                sum += temperatures[i][j];
            }
            averageTemp[i] = sum / 7;
        }

        for(int i=0; i<5; i++) {
            System.out.println("Average Temperature Patient " + (i+1) + ": " + averageTemp[i]);
        }

        float highestAvg = averageTemp[0];
        int highestAvgIndex = 0;
        for(int i=1; i<5; i++) {
            if(averageTemp[i] > highestAvg) {
                highestAvg = averageTemp[i];
                highestAvgIndex = i;
            }
        }
        System.out.println("Patient " + (highestAvgIndex+1) + " had the Highest Weekly Average");

        sc.close();
    }
}