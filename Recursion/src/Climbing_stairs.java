public class Climbing_stairs {
    static int count=0;
    public static void climbing(int curr,int n, String ans){
        if (curr==n){
            System.out.println(ans);
            count++;
            return;
        }
        if(curr>n){
            return;
        }
        climbing(curr+1,n,ans+"1");
        climbing(curr+2,n,ans+"2");
        climbing(curr+3,n,ans+"3");
    }
    public static void main(String[] args) {
        climbing(0,4,"");
        System.out.println(count);
    }
}
