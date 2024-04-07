import java.util.*;
public class Chess_board {
    static int c=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard N: ");
        int N = scanner.nextInt();

        // Find and print all valid paths
        System.out.println("All valid paths:");
        findPaths(N, 0, 0, "");

        // Find and print the count of valid paths
        System.out.println("\nTotal number of valid paths:");
        int count = countPaths(N, 0, 0);
        System.out.println(count);
    }

    private static void findPaths(int N, int row, int col, String path) {
        if (row == N - 1 && col == N - 1) {
            System.out.println(path);
            c++;
            return;
        }

        // Knight moves
        if (row + 2 < N && col + 1 < N) {
            findPaths(N, row + 2, col + 1, path + "K");
        }
        if (row + 1 < N && col + 2 < N) {
            findPaths(N, row + 1, col + 2, path + "K");
        }

        // Rook moves (if on an edge)
        if (row == 0) {
            for (int i = col + 1; i < N; i++) {
                findPaths(N, row, i, path + "R");
            }
        }
        if (col == 0) {
            for (int i = row + 1; i < N; i++) {
                findPaths(N, i, col, path + "R");
            }
        }

        // Bishop moves (if on a diagonal)
        if (row== col) {
            for (int i = row + 1; i < N && i == col + 1; i++) {
                findPaths(N, i, i, path + "B");
            }
        } else if (row + col == N - 1) {
            for (int i = row + 1; i < N && i == N - col - 1; i++) {
                findPaths(N, i, N - i - 1, path + "B");
            }
        }
    }

    private static int countPaths(int N, int row, int col) {
        if (row == N - 1 && col == N - 1) {
            return 1;
        }

        int count = 0;

        // Knight moves
        if (row + 2 < N && col + 1 < N) {
            count += countPaths(N, row + 2, col + 1);
        }
        if (row + 1 < N && col + 2 < N) {
            count += countPaths(N, row + 1, col + 2);
        }

        // Rook moves (if on an edge)
        if (row == 0) {
            for (int i = col + 1; i < N; i++) {
                count += countPaths(N, row, i);
            }
        }
        if (col == 0) {
            for (int i = row + 1; i < N; i++) {
                count += countPaths(N, i, col);
            }
        }

        // Bishop moves (if on a diagonal)
        if (row == col) {
            for (int i = row + 1; i < N && i == col + 1; i++) {
                count += countPaths(N, i, i);
            }
        } else if (row + col == N - 1) {
            for (int i = row + 1; i < N && i == N - col - 1; i++) {
                count += countPaths(N, i, N - i - 1);
            }
        }

        return count;
    }
}



//        {0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}


