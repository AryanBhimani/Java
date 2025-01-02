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
public class sem4 {
    int s4;
    public sem4(){
        System.out.println("enter the sgpa of sem1");
        Scanner s=new Scanner(System.in);
        this.s4=s.nextInt();
    }
    public int print(){
        System.out.println("the sgpa of sem1 is "+s4);
        return s4;
    }
}

