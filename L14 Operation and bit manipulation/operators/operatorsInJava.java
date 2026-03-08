public class operatorsInJava {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true
        System.out.println("Less than: " + (a < b)); // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b)); // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Bitwise Operators
        int p = 6; // 110 in binary
        int q = 3; // 011 in binary
        System.out.println("Bitwise AND: " + (p & q)); // 2 (010 in binary)
        System.out.println("Bitwise OR: " + (p | q)); // 7 (111 in binary)
        System.out.println("Bitwise XOR: " + (p ^ q)); // 5 (101 in binary)
        System.out.println("Bitwise NOT: " + (~p)); // -7 (inverts bits)

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c after += : " + c); // 15
        c -= 3; // c = c - 3
        System.out.println("c after -= : " + c); // 12
        c *= 2; // c = c * 2
        System.out.println("c after *= : " + c); // 24
        c /= 4; // c = c / 4
        System.out.println("c after /= : " + c); // 6
        c %= 4; // c = c % 4
        System.out.println("c after %= : " + c); // 2

        // Increment and Decrement Operators
        int d = 5;  
        System.out.println("Post-increment: " + (d++)); // 5
        System.out.println("After Post-increment: " + d); // 6
        System.out.println("Pre-increment: " + (++d)); // 7
        System.out.println("Post-decrement: " + (d--)); // 7
        System.out.println("After Post-decrement: " + d); // 6
        System.out.println("Pre-decrement: " + (--d)); // 5

        // Ternary Operator
        int age = 20;   
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Voting Eligibility: " + eligibility); // Eligible to vote

        //these are some of the most commonly used operators in Java


    }
}