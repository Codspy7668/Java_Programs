import java.util.ArrayList;
import java.util.List;

public class Subset_II {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        List<List<Integer>> big=new ArrayList<List<Integer>>();
        subset(arr, 0, "",big, new ArrayList<Integer>(),true);
        System.out.println(big);
    }


    public static void subset(int[] arr, int vidx ,String ans, List<List<Integer>> big, List<Integer> temp, boolean flag) {
        if (vidx == arr.length) {
            big.add(new ArrayList<Integer>(temp));
            return;


        }
        if (flag == false && arr[vidx] == arr[vidx - 1]) {
            subset(arr, vidx + 1,ans+arr[vidx], big, temp, false);
        } else {
            temp.add(arr[vidx]);
            subset(arr, vidx + 1,ans+arr[vidx], big, temp,  true);
            temp.remove(temp.size()-1);
            subset(arr, vidx+1,ans+arr[vidx],big,temp, false);
        }
    }
}
