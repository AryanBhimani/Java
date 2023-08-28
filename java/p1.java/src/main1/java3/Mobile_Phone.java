package main1.java3;
import java.util.Scanner;
public class Mobile_Phone extends product{
    int mi, ch;
    String Brand;
    int Price1 = 12000;
    int Price2 = 16000;
    int Price3 = 18000;
    int Price4 = 20000;
    void ShawBrand() 
    {
        System.out.println("Enter the Android Mobile Brand : ");
        Scanner s = new Scanner(System.in);
        Brand = s.nextLine();
        System.out.println("Enter the Pro id : ");
        Scanner s2 = new Scanner(System.in);
        Product_id = s2.nextInt();
    }
    void ShawPrice() 
    {
        if (Product_id == 301) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price1);
        } 
        else if (Product_id == 321) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price2);
        } 
        else if (Product_id == 331) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price3);
        } 
        else if (Product_id == 341) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price4);
        }
        else
        {
            System.out.println("Invalid Product id !!");
        }
    }
}
