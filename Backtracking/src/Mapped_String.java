import java.util.*;
public class Mapped_String {
    public static void stoi(String s, int ans)
    {
        if(s.length()==0){
            System.out.print(ans);
            return;
        }
        stoi(s.substring(1), (ans*10)+s.charAt(0));
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        // stoi(s,0);
        System.out.print(s);
    }
}
