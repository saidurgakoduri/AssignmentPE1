package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonincorderTest {

    @Test

    public void NonIncr()
    {
        Nonincorder obj = new Nonincorder();
        int result = obj.order(234534);
        assertEquals(544332,result);
    }
}