package oops;

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends Animal {

    void changeColor() {
        color = "DarkBrown";
    }

    void walk() {
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}