import java.util.Scanner;
class p3c
{
    public static void main(String[] args) {
        System.out.println("enter thr numbea");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if (a%3==0){
            System.out.println("is divisible");
        } else{
            System.out.println("is not divisible");
        }
    }
}