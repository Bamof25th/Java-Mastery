package oops;

public class superKEyWord {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor is called.");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // calling the parent class constructor using 'super'
        System.out.println("horse has  4 legs");
    }
}