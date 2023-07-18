impoer java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        System.out.println("Enter number 3");
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("The average of numbers is "+avg);

    }
}
