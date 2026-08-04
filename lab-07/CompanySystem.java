package Lab07;


class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}


class Manager extends Employee {
    Manager(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        double finalSalary = salary + 20000;
        System.out.println("Manager Salary: " + finalSalary);
    }
}


class Developer extends Employee {
    Developer(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        double finalSalary = salary * 1.10;
        System.out.println("Developer Salary: " + finalSalary);
    }
}


class Intern extends Employee {
    Intern(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        double finalSalary = salary - 5000;
        System.out.println("Intern Salary: " + finalSalary);
    }
}


public class CompanySystem {
    public static void main(String[] args) {

        Employee e1 = new Manager(80000);
        Employee e2 = new Developer(60000);
        Employee e3 = new Intern(20000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}
