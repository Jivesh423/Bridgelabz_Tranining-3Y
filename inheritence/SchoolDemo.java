package inheritence;

// Superclass
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("I am a Student in grade " + grade);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("I am a Teacher of " + subject);
    }
}

class Principal extends Person {
    public Principal(String name, int age) {
        super(name, age);
    }

    public void displayRole() {
        System.out.println("I am the Principal of the School.");
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Student s = new Student("Aman", 15, "10th");
        Teacher t = new Teacher("Ravi Sir", 40, "Maths");
        Principal p = new Principal("Sharma Ji", 55);

        s.displayDetails();
        s.displayRole();

        t.displayDetails();
        t.displayRole();

        p.displayDetails();
        p.displayRole();
    }
}
