package p19;
public class Mini_project {
    public static void main(String[] args) {
        bank b= new bank();
        b.deposit(100000);
        try
        {
            float a=25000;
            System.out.println(a+"rupees withdraw");
            b.withdraw(a);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
