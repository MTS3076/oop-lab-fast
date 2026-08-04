package Lab06;
class Employee2{
    double salary;
    Employee2(double salary){
        this.salary=salary;

    }
    public void displaySalary(){
        System.out.println("Salary is " + salary);
    }

}
class PermanentEmployee extends Employee2{
    PermanentEmployee(double salary){
        super(salary);

    }
     public void calculateBonus(){
         double bonus =0.10 * salary;
         System.out.println("Bonus is " + (int)bonus);
     }
}
public class Company {
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee(578678);
        p1.displaySalary();
        p1.calculateBonus();
    }
}
