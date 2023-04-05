package com.isvaso;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void rotate() {
        int[][] givenMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] expectationMatrix = {
                {13, 9 , 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };
        new RotateImage().rotate(givenMatrix);

        assertArrayEquals(expectationMatrix, givenMatrix);
    }
}