package oops;

/**
 * students
 */
public class students {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aniket";
        s1.rollNo = 263;
        s1.password = "asdasdaasd";
        s1.marks[0] = 90;
        s1.marks[1] = 98;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);// copy
        s2.password = "xyz";
        s1.marks[0] = 99;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // *copy constructor */ shallow copy 
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // }


    //* deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // * constructor
    Student() {
        // non - parameterized
        marks = new int[3];
        System.out.println("Construtor is called");

    }

    Student(String name) {
        // parameterized
        marks = new int[3];
        this.name = name;

    }

    Student(int rollNo) {
        // parameterized
        marks = new int[3];
        this.rollNo = rollNo;

    }
}