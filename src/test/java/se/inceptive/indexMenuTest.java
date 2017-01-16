package se.inceptive;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

// Enhetstest för inlämningen indexMenu

public class indexMenuTest {
    @Test
    public void testIndexMenuSingle()
    {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Menyval 1");
        String expected = "1. Menyval 1\n";

        String actual = indexMenu.indexMenuFunc(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIndexMenuMultiple() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Menyval 1");
        input.add("Menyval 2");
        input.add("Menyval 3");
        String expected = "1. Menyval 1\n" +
                "2. Menyval 2\n" +
                "3. Menyval 3\n";

        String actual = indexMenu.indexMenuFunc(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testIndexMenuNone() {
        ArrayList<String> input = new ArrayList<String>();
        String expected = "";

        String actual = indexMenu.indexMenuFunc(input);

        assertEquals(expected, actual);
    }
}
