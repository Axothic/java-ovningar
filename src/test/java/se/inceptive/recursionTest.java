package se.inceptive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Detta är enhetstest för övningen rekursion

public class recursionTest {
    @Test
    public void testRecursion1() {
        int input = 1;
        int expected = 1;

        int actual = recursion.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testRecursion2() {
        int input = 2;
        int expected = 2;
        int actual = recursion.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testRecursion3() {
        int input = 3;
        int expected = 6;
        int actual = recursion.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testRecursion5() {
        int input = 5;
        int expected = 120;
        int actual = recursion.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testRecursion10() {
        int input = 10;
        int expected = 3628800;
        int actual = recursion.factorial(input);

        assertEquals(expected, actual);
    }
}
