public class p9Box {
    int w,h,d;
    p9Box(){
       System.out.println("defeult constuctor"); 
    }
    p9Box(int width,int depth,int height)
    {
        w=width;
        h=height;
        d=depth;
    }
    void volume()
    {
        System.out.println("parameterized constructor");
        System.out.println("volume is "+" "+ w*h*d);
    }
    public static void main(String[] args) {
        p9Box b=new p9Box();
        p9Box b1=new p9Box(3,5,2);
        b1.volume();

    }
}