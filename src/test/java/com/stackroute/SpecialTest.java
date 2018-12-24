package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialTest {
    @Test
    public void checkspecial()
    {
        Special obj = new Special();
        String result = obj.checkspecial('a');
        assertEquals("Lower case letter",result);

    }



}
