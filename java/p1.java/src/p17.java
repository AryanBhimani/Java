public class p17 {
   public static void main(String[] args) {
        int b=91;
        try
        {
            int a=b/0;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
   }
}
