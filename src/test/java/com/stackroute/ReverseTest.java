package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;
public class ReverseTest {
    @Test
    public void  checkreverse()
    {
        Reverse obj = new Reverse();
        String result  = obj.checkreverse("sai");
        assertEquals("ias",result);

    }

}
