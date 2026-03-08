import java.util.*;

public class switchstat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Age=sc.nextInt();
        switch(Age){
            case 1: System.out.println("You are 1 year old"); break;
            case 18: System.out.println("You are 18 year old"); break;
            case 20: System.out.println("You are 20 year old"); break;
            default : System.out.println("donot recognoise age");
        }
    }
}
