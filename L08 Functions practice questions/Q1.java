// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Q1 {
    public static float avg(int a , int b , int c) {
        int res1=(a+b+c)/3;
        return res1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        float res=avg(a,b,c);
        System.out.println(res);
    }
}
