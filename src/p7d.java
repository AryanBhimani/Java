import java.util.Scanner;
import java.util.Arrays;
public class p7d {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String sc=s.nextLine();
        char charArray[]=sc.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
