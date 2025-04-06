package OOPs;

 class  operate {
 
    
}

// Interface: Animal
interface Animal {
    // Abstract method (does not have a body)
    void sound();
    
    // Default method with implementation (since Java 8)
    default void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Class Dog implements the Animal interface
class Dog implements Animal {
    // Providing implementation for the sound method
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Class Cat implements the Animal interface
class Cat implements Animal {
    // Providing implementation for the sound method
    public void sound() {
        System.out.println("The cat meows.");
    }
}



public class Main {
    
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