import java.util.*;
public class Numbers_1_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int a=sc.nextInt();
        int i=1;
        while(i<=a){
            System.out.println(i);
            i+=1;
        }
    }
}
