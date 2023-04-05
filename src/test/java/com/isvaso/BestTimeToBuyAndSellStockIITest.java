package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BestTimeToBuyAndSellStockIITest {

    int[] arrayOfPrices;
    int expectationResult;

    public BestTimeToBuyAndSellStockIITest(int[] arrayOfPrices, int expectationResult) {
        this.arrayOfPrices = arrayOfPrices;
        this.expectationResult = expectationResult;
    }

    @Parameterized.Parameters
    public static Collection numbers() {
        List<Object[]> returnList = new ArrayList<>();
        returnList.add(
                new Object[]{
                        new int[]{1, 2},
                        1}
        );
        returnList.add(
                new Object[]{
                        new int[]{6, 2, 3, 1, 2, 1, 1, 6, 1},
                        7}
        );
        returnList.add(
                new Object[]{
                        new int[]{21, 20, 19, 14, 5, 1},
                        0}
        );
        returnList.add(
                new Object[]{
                        new int[]{7, 1, 3, 1, 5, 1, 2, 1, 2},
                        8}
        );

        return returnList;
    }

    @Test
    public void maxProfit() {
        int result = new BestTimeToBuyAndSellStockII().maxProfit(arrayOfPrices);

        assertEquals(expectationResult, result);
    }
}