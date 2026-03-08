// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("enter the num");
        Scanner sc=new Scanner(System.in);
        int countpos=0;
        int countneg=0;
        int countzero=0;
        int lim=sc.nextInt();
        for(int i=0;i<lim;i++){
            int enter=sc.nextInt();
            if (enter>0) {
                System.out.println("the "+ enter + " number is positive");
                countpos++;
            }else if (enter<0) {
                System.out.println("the "+ enter + " number is negative");
                countneg++;
            }else{
                System.out.println("the " + enter + " number is ZERO\n");
                countzero++;
            }
        }
        System.out.println();
        System.out.println("the count of positive num= "+countpos);
        System.out.println("the count of negative num= "+countneg);
        System.out.println("the count of zero num= "+countzero);
        
    }
}


// alternate answer

// import java.util.Scanner;

// public class Q7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int countPos = 0, countNeg = 0, countZero = 0;
//         char choice;

//         do {
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             if (num > 0) {
//                 System.out.println(num + " is positive");
//                 countPos++;
//             } else if (num < 0) {
//                 System.out.println(num + " is negative");
//                 countNeg++;
//             } else {
//                 System.out.println(num + " is ZERO");
//                 countZero++;
//             }

//             System.out.print("Do you want to enter another number? (y/n): ");
//             choice = sc.next().charAt(0);

//         } while (choice == 'y' || choice == 'Y');

//         System.out.println("\nFinal Counts:");
//         System.out.println("Positive numbers = " + countPos);
//         System.out.println("Negative numbers = " + countNeg);
//         System.out.println("Zeros = " + countZero);

//         sc.close();
//     }
// }
