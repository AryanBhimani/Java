import java.util.Scanner;
public class p5d {
    public static void main(String[] args) {
        int i;
        System.out.println("enter the number"); 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean f=false;
        for  (i=2; i<=n/2; i++) {
            if (n%i==0) {
                f=true;
                break;
            }
        } if (!f) {
            System.out.println("is a prime");
        }
    }
}
