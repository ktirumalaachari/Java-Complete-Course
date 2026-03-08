import java.util.Scanner;

public class Q_Factorial {
    public static int fact(int a) {
        int out=1;
        for(int i=a;i>=1;i--){
            out=out*i;
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();

        int pro=fact(a);
        System.out.println(pro);
    }
}
