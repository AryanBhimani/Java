import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class p3b {
    public static void main(String args[]){
        System.out.println("enter the first number");
        Scanner S=new Scanner(System.in);
        int A=S.nextInt();

        System.out.println("enter the second number");
        int B=S.nextInt();

        System.out.println("enter the third number"); 
        int C=S.nextInt();

        if (A>B && A>C){
            System.out.println("A is maximun");
        } else if (B>A && B>C){
            System.out.println("B is maximun");
        } else {
            System.out.println("C is maximun");
        }
    }
}
 