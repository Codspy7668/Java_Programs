import java.util.*;
public class sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which sum is to be calculated");
        int a=sc.nextInt();
       int sum=0;
        int i=1;
       while(i<=a){
           sum+=i;
           i+=1;
       }
        System.out.println("The sum of natural numbers upto "+a+" value is "+sum);


    }


}
