import java.util.Scanner;
public class p6b {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i,j,even=0;
        int[]a=new int[n];
        
        System.out.println("enter the element");
        for (i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        for (i=0; i<n; i++)
        {
            if (a[i]%2==0)
            even++;
        }
        System.out.println("even number are"+even);
    }
}
    