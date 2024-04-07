import java.util.Scanner;

public class Dice_rolling {///// in how many ways the number is obtained by the outcomes.

    public static void die(int m, int curr, String ans){
        if (curr==m){
            System.out.println(ans+" ");
            return;
        }
        if (curr>m){
            return;
        }

        for (int dice=1;dice<=m;dice++){
            die(m,curr +dice,ans+dice);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the faces");
        int m=sc.nextInt();
        die(m,0,"");

    }
}
