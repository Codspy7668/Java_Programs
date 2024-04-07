import java.util.ArrayList;

public class Subset {
    static  int count=0;
    public static void main(String[] args) {
        int [] arr={1,2,3};
        ArrayList<ArrayList<Integer>> big=new ArrayList<ArrayList<Integer>>();
        subset(arr,0,new ArrayList<Integer>(), big);
        System.out.println(big);
        System.out.println(count);
    }
    public static void subset(int []arr, int vidx, String ans){
        if(vidx==arr.length){
            System.out.println(ans);
            count++;
            return;
        }
        subset(arr, vidx,ans+arr[vidx]);
        subset(arr, vidx+1,ans);
    }
    public static void subset(int []arr, int vidx, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> big){
        if(vidx==arr.length){
            big.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(arr[vidx]);
        subset(arr,vidx+1, temp,big);
        temp.remove(temp.size()-1);
        subset(arr,vidx+1,temp,big);
    }
}
