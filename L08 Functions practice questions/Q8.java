// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("enter the num x");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("enter the num x");
        int n=sc.nextInt();
        int res=1;

        for(int i=1;i<=n;i++){
            res=res*x;
        }
        System.out.println(res);

    }
}
