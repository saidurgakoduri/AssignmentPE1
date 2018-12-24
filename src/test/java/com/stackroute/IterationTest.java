package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class IterationTest {

    Iteration obj = new Iteration();

    @Test

    public void loop() {
        int result = obj.PrintLoop(7);
        assertEquals(1, result);
    }
}
