// Abstraction using Interfaces in Java
// ------------------------------------
// An interface is a collection of abstract methods (and constants).
// It is used to achieve 100% abstraction (before Java 8).
// A class that implements an interface must provide code for all its methods.

interface Animal {
    // Abstract methods (no body)
    void makeSound();
    void eat();
}

// Class Dog implements the Animal interface
class Dog implements Animal {
    // Providing implementation for makeSound()
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }

    // Providing implementation for eat()
    public void eat() {
        System.out.println("The dog eats bones.");
    }
}

// Class Cat implements the Animal interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("The cat meows: Meow Meow!");
    }

    public void eat() {
        System.out.println("The cat eats fish.");
    }
}

public class Interface{
    public static void main(String[] args) {
        // We cannot create objects of an interface
        // Animal a = new Animal(); // ❌ Not allowed

        // Create objects of classes that implement the interface
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call methods defined in the interface
        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}

/*
Simple Explanation:
-------------------
An interface is like a rule book — it defines what a class must do,
but not how to do it.

When a class implements an interface, it promises to write the code
for all the methods declared inside that interface.

This helps achieve abstraction because we only care about
the actions (method names), not how they are performed internally.

For example:
- The "Animal" interface says every animal must "makeSound()" and "eat()".
- Each animal (Dog, Cat) provides its own version of these actions.

In short:
Interface = What to do
Class implementing it = How to do
*/
