import java.util.Scanner;
public class p5a {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i,j;
        int[]a=new int[n];
        
        System.out.println("enter the element");
        for (i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        for (i=0; i<n; i++){
            for (j=i+1; j<n; j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("after ascending to decending");
        for (i=0; i<n; i++){
            System.out.println(a[i]);
        }
        for (i=0; i<n; i++){
            for (j=i+1; j<n; j++){
                if (a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("after decending to ascending");
        for (i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}