package main1.java;

public class Result extends Exam{
    int total,per;
    Result(){
       this.sub1=sub1;
       this.sub2=sub2;
       this.sub3=sub3;
       total=sub1+sub2+sub3;
       per=total*100/300;
    }
    void display(){
        System.out.println("enter the student name"+name);
        System.out.println("enter the student enrollment_no"+enrollment_no);
        System.out.println("enter the student Exam_no"+exam_no);
        System.out.println("enter the student total"+total);
        System.out.println("enter the student percentage"+per);
    }
}
