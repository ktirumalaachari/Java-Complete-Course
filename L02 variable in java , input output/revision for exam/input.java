import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Create Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);
        
        // ========== OUTPUT METHODS ==========
        System.out.println("=== OUTPUT METHODS IN JAVA ===");
        
        // 1. println() - prints and moves to next line
        System.out.println("This is println - moves to next line");
        
        // 2. print() - prints without moving to next line
        System.out.print("This is print - ");
        System.out.print("stays on same line\n");
        
        // 3. printf() - formatted output
        System.out.printf("Formatted output: %d + %d = %d\n", 5, 3, 8);
        
        System.out.println("\n=== INPUT METHODS IN JAVA ===");
        
        // ========== INTEGER INPUT ==========
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        System.out.println("You entered integer: " + num);
        
        // ========== FLOAT INPUT ==========
        System.out.print("Enter a float number: ");
        float floatNum = sc.nextFloat();
        System.out.println("You entered float: " + floatNum);
        
        // ========== DOUBLE INPUT ==========
        System.out.print("Enter a double number: ");
        double doubleNum = sc.nextDouble();
        System.out.println("You entered double: " + doubleNum);
        
        // ========== LONG INPUT ==========
        System.out.print("Enter a long number: ");
        long longNum = sc.nextLong();
        System.out.println("You entered long: " + longNum);
        
        // ========== BOOLEAN INPUT ==========
        System.out.print("Enter a boolean (true/false): ");
        boolean boolValue = sc.nextBoolean();
        System.out.println("You entered boolean: " + boolValue);
        
        // ========== STRING INPUT (single word) ==========
        System.out.print("Enter a single word: ");
        String word = sc.next();
        System.out.println("You entered word: " + word);
        
        // ========== STRING INPUT (full line) ==========
        sc.nextLine(); // consume the leftover newline
        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine();
        System.out.println("You entered sentence: " + sentence);
        
        // ========== CHARACTER INPUT ==========
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("You entered character: " + ch);
        
        // ========== FORMATTED OUTPUT EXAMPLES ==========
        System.out.println("\n=== FORMATTED OUTPUT EXAMPLES ===");
        
        // %d for integer
        System.out.printf("Integer: %d\n", num);
        
        // %f for float/double (default 6 decimal places)
        System.out.printf("Float: %f\n", floatNum);
        
        // %.2f for 2 decimal places
        System.out.printf("Float with 2 decimals: %.2f\n", floatNum);
        
        // %s for string
        System.out.printf("String: %s\n", word);
        
        // %c for character
        System.out.printf("Character: %c\n", ch);
        
        // %b for boolean
        System.out.printf("Boolean: %b\n", boolValue);
        
        // Multiple values in one line
        System.out.printf("Name: %s, Age: %d, Height: %.2f\n", word, num, doubleNum);
        
        // Close the scanner
        sc.close();
        System.out.println("\n=== Program Completed ===");
    }
}
