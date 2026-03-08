import java.util.Scanner;

class TwoNamesAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two names and one age: ");
        String name1 = sc.next();     
        String name2 = sc.next();    
        int age = sc.nextInt();       

        System.out.println("First Name: " + name1);
        System.out.println("Second Name: " + name2);
        System.out.println("Age: " + age);

        sc.close();
    }
}
