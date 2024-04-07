public class Lexicographic_number {
    public static void count(int n, int curr){
        if (curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            count(n, curr*10+i);
        }
    }

    public static void main(String[] args) {
        int n=15;
        count(n,0);
    }
}
