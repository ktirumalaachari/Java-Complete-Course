public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int number = 10 / 0; // This will cause an error (divide by zero)
            System.out.println("Result: " + number);
        } catch (ArithmeticException e) {
            System.out.println("Error: You can't divide by zero!");
        }

        System.out.println("Program continues after the error.");
    }
}
