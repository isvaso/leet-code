package com.isvaso;

/**
 * You are given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees (clockwise).
 * <br><br>
 * You have to rotate the image in-place, which means you have to modify
 * the input 2D matrix directly.
 * <br><br>
 * DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        int buffer;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                buffer = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buffer;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                buffer = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = buffer;
            }
        }
    }
}
