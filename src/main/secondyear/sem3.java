/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondyear;

/**
 *
 * @author Aryan
 */
import java.util.Scanner;
public class sem3 {
    int s3;
    public sem3(){
        System.out.println("enter the sgpa of sem1");
        Scanner s=new Scanner(System.in);
        this.s3=s.nextInt();
    }
    public int print(){
        System.out.println("the sgpa of sem1 is "+s3);
        return s3;
    }
}
