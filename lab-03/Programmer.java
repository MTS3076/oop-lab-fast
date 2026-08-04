package Lab03;

public class Programmer {
    int id;
    String name;
    String preferredProgrammingLang;
    int numberOfProblemSolved;

    public Programmer(){
        id=129;
        name="Taha";
        preferredProgrammingLang="Python";
        numberOfProblemSolved=77;
    }
    public void display(){
        System.out.println("Programmer Id =" +id);
        System.out.println("Programmer Name =" +name);
        System.out.println(" Preferred Programming Language =" +preferredProgrammingLang);
        System.out.println(" numberOfProblemSolved =" +numberOfProblemSolved);
    }
    public void setProblemSolved(int ps){
        numberOfProblemSolved=ps;
    }

    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.display();
        p1.setProblemSolved(78);
        System.out.println("After updating problems solved");
        p1.display();
    }
}
