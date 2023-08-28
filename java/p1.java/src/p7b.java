public class p7b {
    public static void main(String[] args) {
        String s="aryan";
        int count=0;
        int a=s.length();
        for(int i=0; i<a; i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("vovels are"+count);
    }
}
