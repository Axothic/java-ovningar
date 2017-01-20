package se.inceptive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class counterStringTest {

    @Test
    public void counterStringTestTen() {
        int input = 10;
        String expected = "1*3*5*7*10";

        String actual = App.counterString(input);

        assertEquals(expected, actual);
    }

    @Test
    public void counterStringTestSeventeen() {
        int input1 = 17;
        String expected = "*2*4*6*8*11*14*17";

        String actual = App.counterString(input1);

        assertEquals(expected, actual);
    }
}