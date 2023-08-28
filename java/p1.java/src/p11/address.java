import java.util.Scanner;
public class address extends biodata {
    String city;
    int pin;
    void display(){
        System.out.println("enter city");
        Scanner s=new Scanner(System.in);
        city=s.nextLine();

        System.out.println("enter pin");
        pin=s.nextInt();
    }
}
