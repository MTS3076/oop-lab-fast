package Lab07;

public class Shape {
    public void area(){
        System.out.println("Area of shape");
    }

    public static void main(String[] args) {
     Shape s1 = new Circle(7);
     Shape s2 = new Rectangle(5,4);
     Shape s3 = new Triangle(3,4);
     s1.area();
     s2.area();
     s3.area();
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        double Area = 3.14*radius*radius;
        System.out.println("Area of circle is " + Area);
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double l,double w){
        length=l;
        width=w;
    }
    @Override
    public void area(){
        double Area=length*width;
        System.out.println("Area of rectangle is " + Area);
    }
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle (double b,double h){
        base=b;
        height=h;
    }
    @Override
    public void area(){
        double Area=0.5*base*height;
        System.out.println("Area of triangle is " + Area);
    }
}
