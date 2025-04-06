package OOPs;
// Class representing a Person
public class Person {
    // Private field
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the name
    public Person(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Creating a new Person object
        Person person = new Person("Alice");

        // Accessing the private field through getter method
        System.out.println("Name: " + person.getName());

        // Changing the name using setter method
        person.setName("Bob");

        // Accessing the updated name through getter method
        System.out.println("Updated Name: " + person.getName());
    }
}

// encapsulation - writting data in single unit with hidding the data 
// abstraction  - 