package oops;

public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();

        shark.eat();

    }

}

// Base class
class Animal {
    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breath");
    }
}

// Derived Class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
