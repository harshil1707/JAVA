//Types of Polymorphism IMP
//1. Compile Time Polymorphism (Static) --> Overloading
//2. Runtime Polymorphism (Dynamic) --> OverRiding

class Student {
    String name;
    int age;
    public void displayInfo(String name) {
        System.out.println(name);
    }
    public void displayInfo(int age) {
        System.out.println(age);
    }
    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        s1.displayInfo("Aman");
        s1.displayInfo(24);
        s1.displayInfo("Aman", 24);
    }
}
