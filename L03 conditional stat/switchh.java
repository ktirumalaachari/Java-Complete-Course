import java.util.Scanner;

public class switchh{
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        int butt=sc1.nextInt();

        switch(butt){
            case 1 : System.out.println("Hello ...!");
            break;
            case 2 : System.out.println("Namaste...");
            break;
            case 3 : System.out.println("Hiiiiii...");
            break;
            default : System.out.println("Invalid ");

        }
    }
}