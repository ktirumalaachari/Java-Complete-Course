import java.util.Scanner;

public class Q_product_2_num {
    public static int calculatepro(int a, int b) {
        int pro=a*b;
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=calculatepro(a,b);
        System.out.println(sum);
    }
}
