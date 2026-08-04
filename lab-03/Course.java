package Lab03;

public class Course {
    int CourseCode;
    String CourseName;
    int CreditHours;

    public Course() {
        CourseCode = 1014;
        CourseName = "Object Oriented Programming";
        CreditHours = 3;
    }

    public void display() {
        System.out.println("Course Code = " + CourseCode);
        System.out.println("Course Name = " + CourseName);
        System.out.println("Credit Hours = " + CreditHours);
    }


    public static void main(String[] args) {
        Course c1= new Course();
        Course c2= new Course();
        c1.display();
        c2.display();
    }
    }

