public class p2d {
    public static void main(String[] args) {
        int N=3,total=0,percentege;
        int marks[]={65,60,50};
        for (int i=0; i<N; i++){
            total+=marks[i];
        }
        percentege=total/N;
        System.out.println("percentege is"+percentege +"%");
    }
}
