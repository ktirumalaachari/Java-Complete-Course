import java.util.Scanner;

public class TryCatchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter operation (+, -, *, /): ");
            String op = scanner.nextLine();

            int result = 0;

            try {
                switch (op) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2; 
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        return;
                }

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Program ended. Thank you!");
            scanner.close();
        }
    }
}
