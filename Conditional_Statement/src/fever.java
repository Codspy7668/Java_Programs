import java.util.*;
public class fever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp=103.5;
        System.out.println("Enter temperature");
        double fever=sc.nextDouble();
        if(fever>temp){
            System.out.println("You have Fever");
        }
        else if(fever==temp){
            System.out.println("you are about to have fever / Slight fever");
        }
        else{
            System.out.println("You do not have fever");
        }
    }
}
