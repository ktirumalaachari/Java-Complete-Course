import java.util.Scanner;

public class creatingArray {
    public static void main(String[] args) {
        int marks[]= new int[3];
        marks[0]=99;
        marks[1]=94;
        marks[2]=95;

        for(int i=0 ; i<3;i++){
            System.out.println(marks[i]);
        }

        // second way to take input
        int marks2[]={1,2,3,4,4,5,5};
        for(int i=0 ; i<3;i++){
            System.out.println(marks2[i]);
        }

        // user input 
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];

        // input
        for(int i=0 ; i<3;i++){
            num[i]=sc.nextInt();
        }

        // o/p
        for(int i=0 ; i<3;i++){
            System.out.println(num[i]);
        }

    }
}
