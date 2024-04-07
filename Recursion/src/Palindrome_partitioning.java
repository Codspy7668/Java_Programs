public class Palindrome_partitioning {
    public static void main(String[] args) {
       palindromepartitioning("nitin", "");
    }
    public static  void palindromepartitioning(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=1;i<=ques.length();i++){
            String roq=ques.substring(i);
            String comp=ques.substring(0,i);
            if(ispalindrome(comp))
            palindromepartitioning(roq, ans+comp+" ");

        }
    }
    public static  boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return  true;

    }
}
