package com.stackroute;

import org.junit.Test;


import static org.junit.Assert.*;

public class EvenTest {

    @Test
    public void EvencheckTest() {
        Even obj   = new Even();
        String result=obj.evencheck(26);
        assertEquals("jerry",result);

    }


}

