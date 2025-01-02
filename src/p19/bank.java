package p19;
public class bank {
    int Acc_ro;
    float fund;
    public void deposit(float amount)
    {
        fund = amount;
        System.out.println("Amount Deposited = "+amount);
    }
    public void withdraw(float a)throws Exception
    {
        if(a>fund)
        {
            throw new Exception("Fund is insufficient");
        }
        else
        {
            float newfund = fund -a;
            fund = newfund;
            System.out.println("Balance after withdraw = "+fund);
        }
    }
}