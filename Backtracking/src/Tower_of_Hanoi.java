public class Tower_of_Hanoi {
    static  int count=0;
    public static void main(String[] args) {
int n=5;
toh(n,"A","B","C");


        System.out.println(count);

    }
    public static void toh(int n, String help, String src, String des){
        if(n==0){
            count++;
            return;
        }
        toh(n-1,src, des, help);
        System.out.println("Moving"+n+"th disc from "+src+ " to "+des);
        toh(n-1,help,src,des);
    }
}
