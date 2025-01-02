package main1.java;
import java.util.Scanner;
public class Student {
    String name;
    int enrollment_no,exam_no;
    Student(){
        System.out.println("enter the name");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();

        System.out.println("enter the enrollment_no");
        enrollment_no=s.nextInt();

        System.out.println("enter the exam_no");
        exam_no=s.nextInt();
    }
}
