public class Factorial {
    public static int fac(int n){
        if (n==1 || n==0){
            return 1;
        }
        int f=fac(n-1);
        return f*n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fac(n));
    }
}
