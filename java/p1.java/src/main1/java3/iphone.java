package main1.java3;
import java.util.Scanner;
public class iphone extends Mobile_Phone{
    int Price1=50000;
    int Price2=60000;
    int Price3=80000;
    int Price4=45000;
    void ShawBrand()
    {
        System.out.println("Enter the iphone mobile brand: ");
        Scanner sc=new Scanner(System.in);
        Brand = sc.nextLine();
        System.out.println("Enter the Pro id: ");
        Scanner s3=new Scanner(System.in);
        Product_id=s3.nextInt();
    }
    void shawPrice() 
    {
        if (Product_id == 201) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price1);
        } 
        else if (Product_id == 221) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price2);
        } 
        else if (Product_id == 231) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price3);
        } 
        else if (Product_id == 241) 
        {
            System.out.println("Price of " + Product_id + " is : " + Price4);
        }
        else
        {
            System.out.println("Invalid Product id !!");
        }
    }
}
