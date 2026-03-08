// Encapsulation Example in Java
// ------------------------------------
// Encapsulation means hiding the data (variables) of a class
// from other classes and allowing access only through public methods.
// It helps to protect data from unauthorized access or modification.

class Student {
    // Step 1: Make data members private (data hiding)
    private String name;
    private int age;

    // Step 2: Provide public getter and setter methods
    // to read and modify the private data safely.

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age (with validation)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Student class
        Student s1 = new Student();

        // Set data using setter methods
        s1.setName("Alice");
        s1.setAge(20);

        // Access data using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // Trying to set invalid age
        s1.setAge(-5); // Will show validation message
    }
}

/*
Encapsulation is like putting data (variables) and the code that works on that data (methods)
inside a single box (class). 
We make variables private so that no one can access them directly from outside.
Instead, we use public methods (getters and setters) to control how data is read or changed.
This keeps our data safe and makes the program easier to manage and debug.
*/
