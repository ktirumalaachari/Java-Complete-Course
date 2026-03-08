// Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.io.*;

class Q9 {

    static int gcd(int a, int b)
    {
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;
    }

    public static void main(String[] args)
    {
        int a = 20, b = 28;
        System.out.print(gcd(a, b));
    }
}