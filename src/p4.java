import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class p4 {
    public static void main(String[] args) {

        System.out.println("enter a");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("enter b");
        int b=sc.nextInt();

        System.out.println("enter your choice");
        System.out.println("1.minimun of two");
        System.out.println("2.addition of two");
        System.out.println("3.multiplication of two");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
                if (a<b) {
                    System.out.println("a is minimun");
                } else {
                    System.out.println("b is minimun");
                }
                break;
            case 2:
                ch=a+b;
                System.out.println("addition of two number");
            case 3:
                ch=a*b;
                System.out.println("multiplication of two number");
                break; 
        }
    }
}