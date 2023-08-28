import java.util.Scanner;
public class p6a {
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int a[]=new int[size];
        int b[]=new int[size];

        System.out.println("enter the number");
        for (int i=0; i<size; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("after copy one arrray to another");
        for (int i=0; i<size; i++) {
            b[i]=a[i];
        }
        for (int i=0; i<size; i++)
        System.out.println(b[i]);
    }
}