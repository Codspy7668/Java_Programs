public class Permutations_of_String {
    public static void main(String[] args) {
        String str="abc";
//        countpermutation(str,"");
        System.out.println(countpermutation(str,""));
    }
    public static int countpermutation(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            return 1;
        }
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String s1=str.substring(0,i);
            String s2=str.substring(i+1);
           count+=countpermutation(s1+s2,ans+ch);


        }
        return count;
    }
}