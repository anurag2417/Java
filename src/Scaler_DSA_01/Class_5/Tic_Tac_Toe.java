//package Scaler_DSA_01.Class_5;
//
//public class Tic_Tac_Toe {
//    public static class TicTacToe{
//        TicTacToe(int row, int col, int player) {
//
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
//
//class TicTacToe {
//
//    char[][] board;
//
//    /** Initialize your data structure here. */
//    public TicTacToe(int n) {
//        board = new char[n][n];
//    }
//
//    /**
//     * Player {player} makes a move at ye le ({row}, {col}).
//     * @return 0: No one wins; 1: Player 1 wins; 2: Player 2 wins.
//     */
//
//
//    private boolean hasWon(int r, int c, char ch){
//        // row
//        boolean checkRow = true;
//        for(int j=0; j<board[0].length; j++){
//            checkRow = checkRow && (board[r][j]==ch);
//        }
//
//
//
//        // col
//        boolean checkCol = true;
//        for(int i=0; i<board.length; i++){
//            checkCol = checkCol && (board[i][c]==ch);
//        }
//
//
//        // diag1
//        boolean checkD1 = true;
//        for(int i=0; i<board.length; i++){
//            checkD1 = checkD1 && (board[i][i]==ch);
//        }
//
//        // diag2
//        boolean checkD2 = true;
//        int N = board.length;
//        for(int i=0; i<board.length; i++){
//            checkD2 = checkD2 && (board[i][N-1-i]==ch);
//        }
//
//        if (hasWon(row , col, 'X') == true){
//            return 1;
//        }else{
//            return 0;
//        }
//
//
//        public int move(int row, int col, int player) {
//            if(player == 1){
//                // 'X'
//                board[row][col] = 'X';
//                if(hasWon(row, col, 'X')==true){
//                    return 1;
//                }else{
//                    return 0;
//                }
//            }else if(player == 2){
//                // 'O'
//                board[row][col] = 'O';
//                if(hasWon(row, col, 'O')==true){
//                    return 2;
//                }else{
//                    return 0;
//                }
//            }
//
//            return 0;
//
//
//        }