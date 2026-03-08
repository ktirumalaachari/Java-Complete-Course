class Main {
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[10] = 50;   // array index error
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }
        catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
