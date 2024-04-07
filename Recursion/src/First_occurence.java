public class First_occurence {
    public static int index(int arr[], int key, int idx){
        if (arr[idx]==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return index(arr,key,idx+1);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,2,3};
        int key=4;
        System.out.println(index(arr,key,0));
    }



}
