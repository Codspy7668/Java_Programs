public class Queens {
    static int count=0;
    public static void main(String[] args) {
        int tq=2;
        int n=4;
        boolean [] board=new boolean[n];
        permutation(board,tq,"",0);
        System.out.println(count);

    }
    public static  void permutation(boolean [] board, int tq, String ans, int qpsf){
        if (qpsf==tq){
            System.out.println(ans);
            count++;
            return;

        }
        for (int i=0;i<board.length;i++){
            if (board[i]==false){
                board[i]=true;
                permutation(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1);

                board[i]=false;

            }
        }
    }
}
