package com.isvaso;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid.
 * <br><br>
 * Only the filled cells need to be validated according to the following rules:
 * <ul>
 *     <li>Each row must contain the digits 1-9 without repetition.</li>
 *     <li>Each column must contain the digits 1-9 without repetition.</li>
 *     <li>Each of the nine 3 x 3 sub-boxes
 *     of the grid must contain the digits 1-9 without repetition.</li>
 * </ul>
 * Note:
 * <ul>
 *     <li>A Sudoku board (partially filled) could be valid
 *     but is not necessarily solvable.</li>
 *     <li>Only the filled cells need to be validated according
 *     to the mentioned rules.</li>
 * </ul>
 */

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int rowIndex = 0;
        int columnIndex = 0;
        char boxChar;

        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> columnSet = new HashSet<>();
            Set<Character> boxSet = new HashSet<>();

            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !columnSet.add(board[j][i]))
                    return false;

                rowIndex = 3 * (i / 3);
                columnIndex = 3 * (i % 3);
                boxChar = board[rowIndex + j / 3][columnIndex + j % 3];

                if (boxChar != '.' && !boxSet.add(boxChar))
                    return false;
            }
        }

        return true;
    }
}
