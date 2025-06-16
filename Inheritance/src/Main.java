//Types of Polymorphism IMP
//2. Runtime Polymorphism (Dynamic) --> OverRiding
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(0.5*b*h);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Circle c = new Circle();
        t.area(5,10);
        c.area(5);
        Shape genericShape = new Shape();
        genericShape.area();
    }
}