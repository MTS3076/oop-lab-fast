package Lab06;
class Employee{
      public void work(){
          System.out.println("Employee is working");
      }
}
class Manager extends Employee{
    public void manageTeam(){
        System.out.println("Manager is managing the team");
    }

}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.work();
        m1.manageTeam();
    }
}
