import java.util.Scanner;

public class table {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mult=1;
        for(int i=1;i<=10;i++){
            mult=num*i;
            System.out.println(num +"*"+i +"="+mult);
        }
    }
}
