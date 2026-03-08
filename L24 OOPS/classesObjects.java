class pen{
       String color;
       String type;
       
       public void write(){
        System.out.println("write something");
       }
}

public class classesObjects {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.color="red";
        p1.write();
    }
}
