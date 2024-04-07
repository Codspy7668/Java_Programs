import java.util.ArrayList;
import java.util.List;

public class Generate_Paranthesis {
    public static void parenthesis(int n, int open, int close, String ans,List<String>list){
        if (open==n && close==n){
            System.out.println(ans+" ");
            return;
        }

        if(open>n || close>open){

            return;

        }

        parenthesis(n,open+1,close,ans+"(",list);
        parenthesis(n,open,close+1,ans+")",list);

    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();



        int n=3;


        parenthesis(n,0,0,"",list);


    }

}
