package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ReverseIntegerTest {

    int givenNumber;
    int expectationNumber;

    public ReverseIntegerTest(int givenNumber, int expectationNumber) {
        this.givenNumber = givenNumber;
        this.expectationNumber = expectationNumber;
    }

    @Parameterized.Parameters
    public static Collection testParameters() {
        List<Object> parametersList = new ArrayList<>();

        parametersList.add(
                new Object[]{-123, -321})
        ;
        parametersList.add(
                new Object[]{Integer.MIN_VALUE, 0}
        );
        parametersList.add(
                new Object[]{-2147483648, 0}
        );
        parametersList.add(
                new Object[]{2147483647, 0}
        );
        parametersList.add(
                new Object[]{1111111112, 2111111111}
        );

        return parametersList;
    }

    @Test
    public void reverse() {
        int result = new ReverseInteger().reverse(givenNumber);

        assertEquals(expectationNumber, result);
    }
}