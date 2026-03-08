class box{
    int length , height , width;
    box(){
        length=width=height=1;
    }
    box(int l , int w){
        length=l;
        width=w;
        height=1;
    }
    box(int l , int w , int h){
        length=l;
        width=w;
        height=h;
    }

    void volume(){
        System.out.println(length*width*height);
    }
}

public class constructoroverloading {
    public static void main(String[] args) {
        box obj1=new box();
        obj1.volume();
        box obj2=new box(2,3);
        obj2.volume();
        box obj3=new box(2,3,4);
        obj3.volume();
    }
}
