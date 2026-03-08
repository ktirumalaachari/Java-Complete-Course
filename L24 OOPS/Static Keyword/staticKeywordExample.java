// Static Keyword Example in Java
// ------------------------------------
// The 'static' keyword in Java is used for memory management.
// It can be applied to variables, methods, blocks, and nested classes.
// Static members belong to the class, not to any specific object.

class Student {
    // Static variable — shared by all objects of the class
    static String schoolName = "Green Valley High";

    // Instance variables — different for each object
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Static method — can be called without creating an object
    static void showSchool() {
        System.out.println("School Name: " + schoolName);
    }

    // Instance method — needs an object to call
    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class staticKeywordExample {
    public static void main(String[] args) {
        // Call static method directly using class name
        Student.showSchool();

        // Create objects
        Student s1 = new Student("Alice", 15);
        Student s2 = new Student("Bob", 16);

        // Access instance methods
        s1.showDetails();
        s2.showDetails();

        // Change static variable using class name
        Student.schoolName = "Sunrise Public School";

        // Call again to see updated value
        Student.showSchool();
    }
}

/*
Simple Explanation:
-------------------
1. Static means "common to all objects".
   - If one object changes the static variable, it changes for all.
   - Example: All students belong to the same school.

2. Static methods can be called without creating an object.
   - Example: Student.showSchool();

3. Non-static (instance) members belong to individual objects.
   - Each student has their own name and age.

In short:
Static variable → shared by all objects.
Static method → called without object.
Instance variable → unique for each object.
*/
