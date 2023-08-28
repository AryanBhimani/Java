import java.util.Scanner;
public class biodata {
    String name;
    String qulification;
    String dob;
    void display(){
        System.out.println("enter name");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();

        System.out.println("enter qulification");
        qulification=s.nextLine();

        System.out.println("enter dob");
        dob=s.nextLine();
    }
}