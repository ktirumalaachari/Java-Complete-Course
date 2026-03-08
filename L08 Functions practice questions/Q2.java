// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;
public class Q2 {
    public static int sumOddnum(int a) {
        int val=0;
        for(int i=0;i<=a;i++){
            if (i%2!=0) {
                val= val+i;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        

        int res=sumOddnum(a);
        System.out.println(res);
    }
}
