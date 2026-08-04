package Lab2Tasks;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int num = sc.nextInt();
        int fail =0;
        int pass =0;
        double average;
        double marks,sum =0.0;
        for(int i=0;i<num;i++){
            System.out.println("Enter the obtained marks for student " + (i+1));
            marks = sc.nextDouble();
            sum +=marks;
            if(marks>=60){
                pass++;
            }
            else {
                fail++;
            }
        }
        average=sum/num;
        System.out.println("Average of the students= " + average);
        System.out.println("Number of students passed= " + pass);
        System.out.println("Number of students failed= " + fail);
        }
    }
