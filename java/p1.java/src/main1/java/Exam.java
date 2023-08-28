package main1.java;
import java.util.Scanner;
public class Exam extends Student{
    int sub1,sub2,sub3;
    Exam(){
        System.out.println("enter the sub1 marks");
        Scanner s= new Scanner(System.in);
        sub1=s.nextInt();

        System.out.println("enter the sub2 marks");
        sub2=s.nextInt();

        System.out.println("enter the sub3 marks");
        sub3=s.nextInt();
    } 
}
