package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;


import static org.junit.Assert.*;

public class StringRepeatTest {
    @Test
    public void rep() {
        StringRepeat repeat = new StringRepeat();
        String result = repeat.Repeat("koduris", 2);
        assertEquals("kodurisrisris", result);

    }



}