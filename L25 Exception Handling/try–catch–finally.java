class Main {
    public static void main(String[] args) {

        try {
            int x = 20 / 2;
            System.out.println(x);
        }
        catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
