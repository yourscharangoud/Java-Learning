// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog myDog = new Dog();

        // Call methods from the parent and child classes
        myDog.eat(); // Inherited method from Animal class
        myDog.bark(); // Method from Dog class
    }
}
