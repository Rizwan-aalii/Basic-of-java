package OOPS;

abstract class Animal {
    // Abstract class: Animal
    // Abstract method (does not have a body)
    public abstract void sound();

    // Concrete method (has a body)
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass: Dog
class Dog extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The dog barks.");
    }
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass: Cat
class Cat extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class class13 {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling methods
        dog.sound();  // Outputs: The dog barks.
        dog.sleep();  // Outputs: This animal is sleeping.

        cat.sound();  // Outputs: The cat meows.
        cat.sleep();  // Outputs: This animal is sleeping.
    }
}


