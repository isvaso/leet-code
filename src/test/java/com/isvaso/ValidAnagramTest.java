package com.isvaso;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        boolean result = new ValidAnagram().isAnagram("car", "rac");

        assertEquals(true, result);
    }
}