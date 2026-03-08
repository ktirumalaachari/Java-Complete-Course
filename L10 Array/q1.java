import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // user input 
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];

        // input
        for(int i=0 ; i<3;i++){
            num[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        for(int i=0 ; i<num.length;i++){
            if (num[i]==x) {
                System.out.println("num is found at :" + i);
            }
        }

    }
}
