package com.stackroute;

import org.junit.Test;
import java.lang.String.*;


import static org.junit.Assert.*;



public class StringVowelTest {

    @Test
    public void stringChecker()
    {
        StringVowel check = new StringVowel();
        String result =check.stringChecker("a");
        assertEquals("vowel",result);

    }
    @Test
    public void CheckTest1()
    {
        StringVowel check = new StringVowel();
        String result =check.stringChecker("@");
        assertEquals("consonant",result);
    }
}
