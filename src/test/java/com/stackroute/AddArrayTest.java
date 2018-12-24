
package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;
public class AddArrayTest {

public class AddingarrayTest {
    AddArray obj = new AddArray();

    @Test
    public void arrayAdderOne()
    {
        int[] var = {7, 9, 5, 6, 7};
        assertEquals(34, obj.arrayAdder(var));
    }
}











}
