class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;   // parameter → variable
        this.age = age;
    }

    void show() {
        System.out.println(this.name + " " + this.age);
    }
}

// without this keyword ->

// class Student {
//     String name;
//     int age;

//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     void show() {
//         System.out.println(name + " " + age);
//     }
// }

// -----------------------------


public class thiskey {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        s1.show();
        s2.show();
    }
}