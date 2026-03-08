public class stringbufferope {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Gaurav Kumar Yadav");
        sb.append("Java");
        sb.insert(5, "world");
        sb.reverse();
        System.out.println(sb);
    }
}
