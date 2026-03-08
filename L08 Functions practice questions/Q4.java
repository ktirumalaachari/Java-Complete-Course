// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;
public class Q4 {
    public static float cirCircum(int a) {
        float circum=2*(float)Math.PI*a;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        float res=cirCircum(a);
        System.out.println("the circumference of cicle ="+res);


    }
}
