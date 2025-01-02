public class p7c {
    public static void main(String[] args){
        String s="aryan";
        String r="";
        int a=s.length();
        for(int i=a-1; i>=0; i--){
            r=r+s.charAt(i);
        }
        if (s.equals(r)){
            System.out.println(s+"is palindrum");
        }
        else
        {
            System.out.println(s+"is not palindrum");
        }
    }
}
