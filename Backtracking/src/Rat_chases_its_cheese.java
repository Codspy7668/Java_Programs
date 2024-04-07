import java.util.Scanner;

public class Rat_chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[m][n];
        for (int i = 0; i < maze.length; i++) {
            String str = sc.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = str.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        Mazepath(maze, 0, 0, ans);
        if (val == false) {
            System.out.println("NO PATH FOUND");
        }
    }
    static  boolean val=false;
    public static  void Mazepath(char[][] maze,int cr, int cc , int [][] ans){

        if(cc<0 || cr<0 || cc>=maze[0].length || cr>=maze.length || maze[cr][cc]=='X'){
           return;
       }
        if(cr==maze.length-1 && cc==maze[0].length-1){
            ans[cr][cc]=1;
            val=true;
            display(ans);
        }
       maze[cr][cc]='X';
       ans[cr][cc]=1;
        Mazepath(maze,cr-1,cc,ans);
        Mazepath(maze,cr,cc-1,ans);
        Mazepath(maze,cr+1,cc,ans);
        Mazepath(maze,cr,cc+1,ans);
        maze[cr][cc]='0';
        ans[cr][cc]=0;

    }
    public static void display(int [][] ans){
        for (int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.println(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
