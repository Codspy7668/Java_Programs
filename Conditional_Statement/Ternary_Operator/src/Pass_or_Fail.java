import java.util.*;
public class Pass_or_Fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        String result =(marks>33)? "Pass":"Fail";
        System.out.println(result);

    }
}
