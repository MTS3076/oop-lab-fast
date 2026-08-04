package Lab04;

public class Employee {
    int empId;
    String name;
    float salary;

    public Employee(int id,String n,float s){
        empId=id;
        name=n;
        salary=s;
    }
    public Employee(Employee e){
        this.empId=e.empId;
        this.name=e.name;
        this.salary=e.salary;
    }
    public void display(){
        System.out.println("Employee Id =" + empId);
        System.out.println("Employee Name =" + name);
        System.out.println("Salary =" + salary);
    }

    public static void main(String[] args) {
        Employee original = new Employee(101,"Ali",500000);
        Employee duplicate = new Employee(original);

        duplicate.name="Taha";
        duplicate.salary=60000;

        System.out.println("Original Employee");
        original.display();
        System.out.println("Duplicate Employee");
        duplicate.display();
    }
}
