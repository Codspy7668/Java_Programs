import java.util.*;
public class print_Helloworld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of number");
        int num=sc.nextInt();
        int counter=1;
        do{
            System.out.println(counter);
            counter++;
            if(counter%10==0){
                System.out.println("Multiple of 10");
            }
            else{
                System.out.println("Not a Multiple of 10");
            }


        }while(counter<=num);
//        do{
//            System.out.println("Hello World");
//            counter++;
//        }while(counter<=5);
    }
}
