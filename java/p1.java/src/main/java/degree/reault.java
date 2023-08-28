/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package degree;

/**
 *
 * @author Aryan
 */
import firstyear.*;
import secondyear.*;
public class reault {
    public static void main(String[] args) {
        sem1 s1=new sem1();
        sem2 s2=new sem2();
        sem3 s3=new sem3();
        sem4 s4=new sem4();
        int total=s1.print() +s2.print() +s3.print() +s4.print();
        int cgpa=total*10/40;
        System.out.println("the cgpa is "+cgpa);    
    }
}
