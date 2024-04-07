public class Sum_upto_n {
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        int f=sum(n-1);
        int s=f+n;
        return s;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
