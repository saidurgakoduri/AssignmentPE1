package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test

    public void palin()
    {
        Palindrome pal = new Palindrome();
        int result = pal.Palindrome(123321);
        assertEquals(123321,result);
    }
}