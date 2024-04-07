import java.util.Scanner;

public class replacepi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            String str=sc.next();
            replace(str,"");
        }
    }
    public static void replace(String str, String ans){
     if (str.length()==0){
         System.out.println(ans);
         return;
     }
     if(str.length()>=2 && str.charAt(0)=='p' && str.charAt(1)=='i'){
         replace(str.substring(2),ans+"3.14");
     }
     else {
         replace(str.substring(1),ans+str.charAt(0));
     }

    }

}
