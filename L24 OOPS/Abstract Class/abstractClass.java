// Abstraction Example in Java
// ------------------------------------
// Abstraction means showing only essential details
// and hiding the complex implementation from the user.
// In Java, abstraction is achieved using abstract classes and interfaces.

abstract class Animal {
    // Abstract method (no body)
    // This method must be implemented by subclasses
    abstract void makeSound();

    // Non-abstract method (has body)
    // Can be used by all subclasses
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Providing implementation for abstract method
    @Override
    void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    // Providing implementation for abstract method
    @Override
    void makeSound() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        // We cannot create an object of an abstract class
        // Animal a = new Animal(); // ❌ Not allowed

        // We can create objects of subclasses instead
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call abstract method (implemented by subclass)
        dog.makeSound();
        cat.makeSound();

        // Call non-abstract method (defined in abstract class)
        dog.eat();
    }
}

/*
Simple Explanation:
-------------------
Abstraction is like driving a car — you use the steering wheel and pedals
without needing to know how the engine works inside.

In Java, abstraction hides complex details from the user.
You can define an abstract class with abstract methods (without body)
and non-abstract methods (with body).

Subclasses must provide their own version (implementation)
of the abstract methods. This helps organize code better and makes it easier to expand or modify.
*/
