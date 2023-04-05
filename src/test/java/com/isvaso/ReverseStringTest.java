package com.isvaso;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        char[] givenArray = {'s', 'o', 'w', 'h', 'o'};
        char[] expectationArray = {'o', 'h', 'w', 'o', 's'};

        new ReverseString().reverseString(givenArray);

        assertArrayEquals(expectationArray, givenArray);
    }
}