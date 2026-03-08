// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to run the program
public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Inherited method from Animal
        myDog.eat(); 
        
        // Method from Dog
        myDog.bark();
    }
}
