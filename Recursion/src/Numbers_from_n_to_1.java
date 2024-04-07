public class Numbers_from_n_to_1 {
    public static  void num(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);     // 5,4,3,2,1
        num(n-1);
        System.out.println(n);    //1,2,3,4,5

    }
    public static void main(String[] args) {
        int n=5;
        num(n);
    }
}
