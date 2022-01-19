package com.backtracking;

public class NQueens {
	final int N = 4;
	int count=0;
	private void nQueensSolution() {
		int[][] chessBoard = new int[N][N];
		if (!nQueensSolutionUtil(chessBoard, 0))
			System.out.println("The solution doesn't exists");
	}

	private boolean nQueensSolutionUtil(int[][] chessBoard, int col) {
		if (col == N) {
			count++;
			return true;
		}

		boolean res = false;
		for (int i = 0; i < N; i++) {
			if (isSafePosition(chessBoard, i, col)) {
				chessBoard[i][col] = 1;
				res = nQueensSolutionUtil(chessBoard, col + 1) || res;
				chessBoard[i][col] = 0;
			}
		}
		return res;
	}

	private boolean isSafePosition(int[][] chessBoard, int row, int col) {
		int i, j;

		for (i = 0; i < col; i++)
			if (chessBoard[row][i] == 1)
				return false;
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (chessBoard[i][j] == 1)
				return false;
		for (i = row, j = col; j >= 0 && i < N; i++, j--)
			if (chessBoard[i][j] == 1)
				return false;

		return true;
	}

	private void printChessBoard(int chessBoard[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + chessBoard[i][j] + " ");
			System.out.println("");
		}
		System.out.println("----------------");
	}

	public static void main(String[] args) {
		NQueens obj = new NQueens();
		obj.nQueensSolution();
		System.out.println("Total number of solutions "+ obj.count);
	}
}