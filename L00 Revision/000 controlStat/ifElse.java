import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("Check age");
        Scanner sc=new Scanner(System.in);
        int Age=sc.nextInt();
        System.out.println("You have entered :"+"Age");
        if (Age>18) {
            System.out.println("your age is more than 18");
        }else if (Age<18) {
            System.out.println("your age is less than 18");
        }else{
            System.out.println("your age is 18");
        }
    }
}
