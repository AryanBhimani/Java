public class trip {
    String soucrs,Destination;
    int days;
    String start_date;
    trip(String s,String d,int da,String sdate){
        soucrs=s;
        Destination=d;
        days=da;
        start_date=sdate;
    }
    trip(){
        soucrs="surat";
        Destination="kedarnath";
        days=30;
        start_date="01/07/2023";
    }
    void display()
    { 
        System.out.println("source is "+soucrs);
        System.out.println("destination is "+Destination);
        System.out.println("days of trip "+days);
        System.out.println("start date is "+start_date);
    }
    public static void main(String[] args) {
        trip b=new trip();
        trip bl=new trip();
        bl.display();
    }
}
