package oops;

/**
 * students
 */
public class students {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("aniket");
        Student s3 = new Student(014);
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int rollNo;

    // * constructor
    Student() {
        // non - parameterized
        System.out.println("Construtor is called");

    }

    Student(String name) {
        // parameterized
        this.name = name;

    }

    Student(int rollNo) {
        // parameterized
        this.rollNo = rollNo;

    }
}