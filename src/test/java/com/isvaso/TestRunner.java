package com.isvaso;

import com.isvaso.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                BestTimeToBuyAndSellStockIITest.class,
                ContainsDuplicateTest.class,
                IntersectionOfTwoArraysIITest.class,
                MoveZeroesTest.class,
                PlusOneTest.class,
                RemoveDuplicatesFromSortedArrayTest.class,
                RotateArrayTest.class,
                RotateImageTest.class,
                SingleNumberTest.class,
                TwoSumTest.class,
                ValidSudokuTest.class,

                FirstUniqueCharacterInAStringTest.class,
                ImplementStrTest.class,
                LongestCommonPrefixTest.class,
                ReverseIntegerTest.class,
                ReverseStringTest.class,
                StringToIntegerTest.class,
                ValidAnagramTest.class,
                ValidPalindromeTest.class,

                MiddleOfTheLinkedListTest.class,
                RansomNoteTest.class
        );

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
