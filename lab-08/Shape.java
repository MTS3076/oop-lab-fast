package Lab08;

interface Area{
    void calArea();
}
class Circle implements Area{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void calArea(){
        double area=3.14*radius*radius;
        System.out.println("Circle Area: " + area);
    }
}
class Rectangle implements Area{
    double length;
    double width;
    Rectangle(double l,double w){
        this.length=l;
        this.width =w;
    }
    public void calArea(){
        double area=length*width;
        System.out.println("Rectangle Area: " + area);
    }
}
public class Shape {
    public static void main(String[] args) {
        Area s1 = new Circle(5);
        Area s2 = new Rectangle(9.1,5.9);
        s1.calArea();
        s2.calArea();
    }
}
