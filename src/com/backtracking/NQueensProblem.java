package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensProblem {
  List<List<String>> outerList;

  public static void main(String[] args) {
    NQueensProblem obj = new NQueensProblem();
    System.out.println(obj.solveNQueens(4));
  }

  public List<List<String>> solveNQueens(int n) {
    char[][] chess = new char[n][n];
    outerList = new ArrayList<>();
    for (char[] row : chess) {
      Arrays.fill(row, '.');
    }
    solveNQueensUtil(chess, 0, n);
    return outerList;
  }

  public void solveNQueensUtil(char chess[][], int col, int n) {
    if (col == n) {
      List<String> innerList = new ArrayList<>();
      for (char[] rows : chess) {
        String answer = String.valueOf(rows);
        innerList.add(answer);
      }
      outerList.add(innerList);
      return;
    }

    for (int i = 0; i < n; i++) {
      if (isSafePosition(chess, i, col, n)) {
        chess[i][col] = 'Q';
        solveNQueensUtil(chess, col + 1, n);
        chess[i][col] = '.';
      }
    }
  }

  public boolean isSafePosition(char chess[][], int row, int col, int n) {
    int i, j;

    for (i = 0; i < col; i++) if (chess[row][i] == 'Q') return false;
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--) if (chess[i][j] == 'Q') return false;
    for (i = row, j = col; i < n && j >= 0; i++, j--) if (chess[i][j] == 'Q') return false;

    return true;
  }
}
