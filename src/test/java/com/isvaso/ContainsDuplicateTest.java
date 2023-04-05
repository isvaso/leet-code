package com.isvaso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test with Parameter(0, 1 etc),
 * without constructor and @Parameterized.Parameter
 */
@RunWith(Parameterized.class)
public class ContainsDuplicateTest {

    @Parameter(0)
    public int[] numsArray;

    @Parameter(1)
    public boolean expectationResult;

    @Parameters
    public static Collection runTestWithParameters() {
        List<Object> returnList = new ArrayList<>();
        returnList.add(new Object[]{new int[]{1, 2, 3}, false});
        returnList.add(new Object[]{new int[]{1, 2, 3, 1}, true});
        returnList.add(new Object[]{new int[]{0}, false});
        returnList.add(new Object[]{new int[]{1, 2, 3, 4, 5, 4, 4}, true});

        return returnList;
    }

    @Test
    public void containsDuplicate() {
        boolean result = new ContainsDuplicate().containsDuplicate(numsArray);

        assertEquals(expectationResult, result);
    }
}