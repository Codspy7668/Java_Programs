public class Math_path {
    static int count=0;
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        print(0, 0, n - 1, m - 1, "");
        System.out.println(count);
    }
    public static void print(int cc, int cr, int ec, int er, String ans) {
        if (cc == ec && cr == er) {
            System.out.println(ans);
            count++;
            return ;
        }
        if (cc > ec || cr > er) {
            return ;
        }
        print(cc + 1, cr, ec, er, ans + "H");
        print(cc, cr + 1, ec, er, ans + "V");
    }

}
