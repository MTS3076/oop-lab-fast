package Lab06;
class Person{
      public void displayPerson(){
          System.out.println("Person is displayed");
      }
}
class Student extends Person{
    public void displayStudent(){
        System.out.println("Student is displayed");
    }
}
class GraduateStudent extends Student{
      public void research(){
          System.out.println("Research is in process");
      }
}
public class UniversitySystem {
    public static void main(String[] args) {
        GraduateStudent g1 = new GraduateStudent();
        g1.displayPerson();
        g1.displayStudent();
        g1.research();
    }
}
