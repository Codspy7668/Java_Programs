public class Queens_Combination {
    static int count=0;
    public static void main(String[] args) {
        int tq=2;
        int n=4;
        boolean [] board=new boolean[n];
        Combination(board,tq,"",0,0);
        System.out.println(count);

    }
    public static  void Combination(boolean [] board, int tq, String ans, int qpsf, int idx){
        if (qpsf==tq){
            System.out.println(ans);
            count++;
            return;

        }
        for (int i=idx;i<board.length;i++){
            if (board[i]==false){
                board[i]=true;
                Combination(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1,i+1);

                board[i]=false;

            }
        }
    }
}
