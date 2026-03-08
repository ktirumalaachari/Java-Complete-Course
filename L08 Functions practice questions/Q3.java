// Write a function which takes in 2 numbers and returns the greater of those two

import java.util.Scanner;
public class Q3 {
    public static int findBigNum(int a , int b) {
        if (a>b) {
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int res=findBigNum(a,b);
        System.out.println("greater num is "+res);
    }
}
