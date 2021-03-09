package com.backtracking;

class SudokuSolver {
    public void solveSudoku(char[][] board) {

        solveSudoku(board, board.length);
    }

    public boolean solveSudoku(char[][] board, int n){
        int x=-1;
        int y=-1;
        boolean isEmpty=true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]=='.'){
                    x=i;
                    y=j;
                    isEmpty=false;
                    break;
                }
            }
            if(!isEmpty)
                break;
        }

        if(isEmpty){
            return true;
        }

        for(char i = '1'; i <= '9'; i++) {
            if(isSafe(board, x, y, i)){
                board[x][y]= i;
                if(solveSudoku(board, n)){
                    return true;
                }
                else{
                    board[x][y]='.';
                }
            }
        }
        return false;
    }

    boolean isSafe(char[][] board, int x, int y, int n){
        for(int i=0; i< board.length; i++){
            if(board[x][i]==n){
                return false;
            }
        }
        for(int i=0; i< board.length; i++){
            if(board[i][y]==n){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int boxRowStart = x-x%sqrt;
        int boxColStart = y-y%sqrt;

        for(int i=boxRowStart; i< boxRowStart+sqrt; i++){
            for(int j=boxColStart; j< boxColStart+sqrt; j++){
                if(board[i][j]==n){
                    return false;
                }
            }
        }
        return true;
    }
}