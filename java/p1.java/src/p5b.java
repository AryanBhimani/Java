import java.util.Scanner;
public class p5b {
    public static void main(String[] args) {
        System.out.println("enter the number"); 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int m=n;
        while(n>0){
            n=n/10;
            count++;
        }
        while(m>0){
            int b=m%10;
            System.out.println("digits at position"+count +b);
            m=m/10;
            count--;
        }
    }
}
 
    
