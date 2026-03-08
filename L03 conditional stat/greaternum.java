import java.util.Scanner;

public class greaternum {
     public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        int num1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        int num2=sc2.nextInt();

        // System.out.println(num1);
        // System.out.println(num2);

        if (num1==num2) {
            System.out.println("both humber are same");
        }
        else if (num1 > num2){
            System.out.println("num1 is greater then num2");
        }
        else{
            System.out.println("num1 is less then num2");
        }
    }
}
