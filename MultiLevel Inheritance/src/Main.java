// Base class Shape
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

// Subclass Triangle extending Shape
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

// Subclass RightAngleTriangle extending Triangle
class RightAngleTriangle extends Triangle {
    public void describe() {
        System.out.println("This is a Right-Angle Triangle, which is a specific type of Triangle.");
    }
}

// Subclass Circle extending Shape
class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}

// Main class to demonstrate the usage of Shape, Triangle, Circle, and RightAngleTriangle classes
public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.area(5, 10);

        Circle myCircle = new Circle();
        myCircle.area(7);

        System.out.println("\n--- Multilevel Inheritance Demonstration ---");

        RightAngleTriangle myRightAngleTriangle = new RightAngleTriangle();
        myRightAngleTriangle.area(6, 8);
        myRightAngleTriangle.describe();
        myRightAngleTriangle.area();

        Triangle anotherTriangle = myRightAngleTriangle;
        anotherTriangle.area(3, 4);
    }
}