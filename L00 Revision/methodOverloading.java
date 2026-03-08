class add{
    public int sum(int a , int b){
        return a+b;
    }
    public int sum(int a , int b, int c){
        return a+b+c;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        add obj=new add();
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.sum(1, 2,3));
    }
}
