class box{
    int length , height , width;
    box(){
        length=width=height=1;
    }
    box(int l , int w , int h){
        length=l;
        width=w;
        height=h;
    }

    void volume(){
        System.out.println(length*height*width);
    }
}

public class constructorpract {
    public static void main(String[] args) {
        box obj1=new box();
        obj1.volume();
        box obj2=new box(2,3,4);
        obj2.volume();
    }
}
