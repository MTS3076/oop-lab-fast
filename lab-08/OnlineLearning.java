package Lab08;
interface Login{
    void log();
}
class Student implements Login{
    public void log(){
        System.out.println("Student logged in");
    }
}
class Instructor implements Login{
    public void log(){
        System.out.println("Instructor logged in");
    }
    public void Courses(){
        System.out.println("Courses are uploaded by Instructor");
    }
}

public class OnlineLearning {
    public static void main(String[] args) {
     Login l1 = new Student();
     Login l2 = new Instructor();
     l1.log();
     l2.log();
     Instructor l3 = new Instructor();
     l3.Courses();
    }
}
