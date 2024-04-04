package backtraking;

public class nqueens {
    public static void print(char[][] board){
        System.out.println("------------------board chess--------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueen(char[][] board, int row) {
        // base case
        if (board.length == row) {
            print(board);
            return;
        }

        // backtracking
        for (int i = 0; i < board.length; i++) {
            board[row][i] = 'Q';
            nQueen(board, row + 1);
            board[row][i] = '.';
        }

    }

    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        nQueen(board, 0);
    }
}
