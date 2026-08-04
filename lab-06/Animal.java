package Lab06;
public class Animal {
    public void sound(){
        System.out.println("Animal makes sound");
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        c.sound();
    }

}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Woof woof");
    }
}
class Cat extends Animal{
    @Override
     public void sound(){
        System.out.println("Meow meow");
    }
}


