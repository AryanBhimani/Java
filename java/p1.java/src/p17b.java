import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
public class p17b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your phone number:");
        String phone=sc.next();
        String regex="\\d{10}";
        boolean result=phone.matches(regex);
        if(result){
            System.out.println("Given phone number is valid");
        }
        else
        {
            System.out.println("Given phone number is not valid");
        }
    }
}
