package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ValidSudokuTest {

    char[][] givenBoard;
    boolean expectationResult;

    public ValidSudokuTest(char[][] givenBoard, boolean expectationResult) {
        this.givenBoard = givenBoard;
        this.expectationResult = expectationResult;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(new Object[]{new char[][]{
                {'1', '.', '3', '.', '2', '.', '.', '.', '.'},
                {'.', '.', '6', '9', '.', '.', '.', '5', '.'},
                {'7', '2', '.', '.', '8', '.', '.', '.', '1'},
                {'.', '.', '5', '.', '.', '.', '.', '2', '.'},
                {'4', '.', '2', '.', '5', '.', '.', '.', '.'},
                {'.', '8', '.', '.', '.', '.', '7', '.', '9'},
                {'.', '.', '.', '1', '7', '3', '.', '.', '.'},
                {'.', '5', '1', '4', '.', '.', '.', '.', '.'},
                {'.', '.', '9', '.', '.', '.', '.', '8', '.'}},
                true
        });
        parametersList.add(new Object[]{new char[][]{
                {'1', '.', '3', '1', '2', '3', '1', '2', '3'},
                {'4', '.', '.', '4', '.', '6', '4', '5', '6'},
                {'7', '.', '9', '7', '8', '9', '7', '8', '9'},
                {'1', '2', '3', '1', '.', '3', '1', '.', '3'},
                {'.', '5', '6', '4', '5', '6', '4', '5', '.'},
                {'7', '8', '.', '7', '8', '9', '7', '.', '9'},
                {'1', '2', '3', '1', '2', '.', '1', '2', '3'},
                {'4', '5', '6', '4', '.', '6', '4', '.', '.'},
                {'7', '.', '.', '.', '8', '9', '.', '8', '9'}},
                false
        });
        parametersList.add(new Object[]{new char[][]{
                {'1', '.', '3', '1', '2', '3', '1', '2', '3'},
                {'3', '.', '.', '4', '.', '6', '4', '5', '6'},
                {'7', '.', '9', '7', '8', '9', '7', '8', '9'},
                {'1', '2', '3', '1', '.', '3', '1', '.', '3'},
                {'.', '5', '6', '4', '3', '6', '4', '5', '.'},
                {'7', '8', '.', '7', '8', '9', '7', '.', '9'},
                {'1', '2', '3', '1', '2', '.', '1', '2', '3'},
                {'4', '5', '6', '4', '.', '6', '4', '.', '.'},
                {'7', '.', '.', '.', '8', '9', '.', '8', '9'}},
                false
        });

        return parametersList;
    }

    @Test
    public void isValidSudoku() {
        boolean result = new ValidSudoku().isValidSudoku(givenBoard);

        assertEquals(expectationResult, result);
    }
}