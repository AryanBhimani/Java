import java.util.Scanner;
public class student {
    int student_id,marks1,subject_code,marks2,total,percentage;
    void getdata(int id, int m, int code){
        System.out.println("enter student_id");
        Scanner s=new Scanner(System.in);
        student_id=s.nextInt();
        
        System.out.println("enter stdeant 1 marks");
        marks1=s.nextInt();

        System.out.println("enter stdeant 2 marks");
        marks2=s.nextInt();

        System.out.println("enter subject_code");
        subject_code=s.nextInt();
    }
    void putdata(){
        total=marks1+marks2;
        percentage=(marks1+marks2)*100/200;
        System.out.println("student_id is"+student_id);
        System.out.println("sudject code is"+subject_code);
        System.out.println("total is"+total);
        System.out.println("percentage is"+percentage);
    }
}
