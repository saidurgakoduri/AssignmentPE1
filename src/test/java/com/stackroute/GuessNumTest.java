
package com.stackroute;

        import org.junit.Test;
        import static org.junit.Assert.assertEquals;
public class GuessNumTest {
    @Test
    public void Guessnumbertest(){
        GuessNum obj =new GuessNum();

        String result=obj.Guessnumber(50);
        assertEquals("Number guessed is greater than the original number",result);
    }
}