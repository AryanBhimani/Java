import java.util.Scanner;
public class p3d {
    public static void main(String[] args) {
        System.out.println("enter thr year");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if (a%4==0){
            System.out.println("is leap year ");
        } else{
            System.out.println("is not leap year");
        }
    }
}
