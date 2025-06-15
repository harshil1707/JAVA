class Student {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    //Non-Parameterized constructor
    Student() {
        System.out.println("Student Constructor");
    }

    //Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    Student(Student s3) {
        this.name = s3.name;
        this.age = s3.age;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 18;
        s1.display();
        Student s2 = new Student("Harshil", 21);
        s2.display();
        Student s3 = new Student(s1);
        s3.display();
    }
}