public class Power {
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        int ans=pow(a,b-1);
        return ans*a;
       
        }



    public static void main(String[] args) {
        int a=2;
        int b=2;
        System.out.println(pow(a,b));
    }
}
