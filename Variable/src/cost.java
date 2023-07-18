import java.util.*;
public class cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of pen");
        float a=sc.nextFloat();
        System.out.println("Enter cost of pencil");
        float b=sc.nextFloat();
        System.out.println("Enter cost of eraser");
        float c=sc.nextFloat();
        float price=a+b+c;
        System.out.println("Total price of items is "+price);
        System.out.println("Final price is "+(0.18*price+price));

    }

}
