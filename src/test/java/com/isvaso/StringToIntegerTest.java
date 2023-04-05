package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringToIntegerTest {

    String givenStringNumber;
    int expectationNumber;

    public StringToIntegerTest(String givenStringNumber, int expectationNumber) {
        this.givenStringNumber = givenStringNumber;
        this.expectationNumber = expectationNumber;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();
        parametersList.add(
                new Object[]{"123", 123}
        );
        parametersList.add(
                new Object[]{"-123", -123}
        );
        parametersList.add(
                new Object[]{"-1234567891011121314151617181920", Integer.MIN_VALUE}
        );
        parametersList.add(
                new Object[]{"1234567891011121314151617181920", Integer.MAX_VALUE}
        );
        parametersList.add(
                new Object[]{"-00123", -123}
        );
        parametersList.add(
                new Object[]{"+00123", 123}
        );

        return parametersList;
    }

    @Test
    public void myAtoi() {
        int result = new StringToInteger().myAtoi(givenStringNumber);

        assertEquals(expectationNumber, result);
    }
}