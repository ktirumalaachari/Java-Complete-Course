public class parse {
    public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);

       System.out.println(((Object)number).getClass().getName()); // knoow that it is a integer

   }

}
