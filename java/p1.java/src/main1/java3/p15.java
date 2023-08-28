package main1.java3;
import java.util.Scanner;
public class p15 {
    public static void main(String[] args){
        product p;
        int ch;
        p=new product()
        {
            void ShawPrice() 
            {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
            void ShawBrand() 
            {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        while(true)
        {
            System.out.println("1. Android");
            System.out.println("2. Iphone");
            System.out.println("Enter your choice :");
            Scanner s1 = new Scanner(System.in);
            ch = s1.nextInt();
            switch(ch)
            {
                case 1:
                    Mobile_Phone w = new Mobile_Phone();
                    w.ShawBrand();
                    w.ShawPrice();
                    break;
                case 2:
                    iphone i = new iphone();
                    i.ShawBrand();
                    i.shawPrice();
                    break;
            }
        }
    }
}
