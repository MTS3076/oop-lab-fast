package Lab05;

import java.util.ArrayList;

public class Student {
    String name;
    double gpa;

    Student(){}

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Moiz", 3.8);
        Student s2 = new Student("Irfan", 1.5);
        Student s3 = new Student("Uzair", 2.3);
        Student s4 = new Student("Ali", 1.9);
        Student s5 = new Student("Taha", 3.6);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for(int i=0; i<students.size(); i++) {
            if(students.get(i).gpa < 2.0) {
                System.out.println("Student Removed at Index " + i + " with GPA " + students.get(i).gpa);
                students.remove(i);
                i--;
            }
        }

        double topperStudent = students.get(0).gpa;
        int topperIndex = 0;
        for(int i=1; i<students.size(); i++) {
            if(students.get(i).gpa > topperStudent) {
                topperStudent = students.get(i).gpa;
                topperIndex = i;
            }
        }
        System.out.println("Topper Student is " + students.get(topperIndex).name + " with GPA of " + students.get(topperIndex).gpa);

        int countDean = 0;
        for(int i=0; i<students.size(); i++) {
            if(students.get(i).gpa > 3.5) {
                countDean++;
            }
        }
        System.out.println("The Number of Students Eligible for Dean's List are: " + countDean);
    }
}
