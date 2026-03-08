import java.util.Scanner;

public class printAndScanner {
    public static void main(String[] args) {
        System.out.println("hello , Gaurav here");
        System.out.println("entre your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("entre your age");
        int age=sc.nextInt();

        System.out.println(name);
        System.out.println(age);

    }
}
