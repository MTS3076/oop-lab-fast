package Lab04;

public class LibraryBook {
    String title;
    float price;

    public LibraryBook(){
        title ="Unknown";
        price=0;
    }
    public LibraryBook(String t){
        title =t;
        price=500;
    }
    public LibraryBook(String t,float p){
        title =t;
        price=p;
    }

    public void display(){
        System.out.println("Title =" + title);
        System.out.println("Price =" + price);
    }

    public static void main(String[] args) {
        LibraryBook b1 =new LibraryBook();
        LibraryBook b2 =new LibraryBook("The Truth");
        LibraryBook b3 =new LibraryBook("Wimpy Kid",980);
        b1.display();
        b2.display();
        b3.display();
    }
}
