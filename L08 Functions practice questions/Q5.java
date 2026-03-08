// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;
public class Q5 {

    public static String confAge(int a) {
        if (a>18) {
            return " yes you are eligible";
        }else{
            return "you are not eligible";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        String res=confAge(a);
        System.out.println(res);

    }
}
