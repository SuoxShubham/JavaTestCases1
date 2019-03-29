package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class PalindromeTest {
    public static Palindrome palindrome;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        palindrome = new Palindrome();

        long l = 6227020800L;


    }
    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        palindrome = null;

    }
    @Test
    public void testString() {
        assertEquals("wow", palindrome.gettestString("wow"));

        assertEquals("wow", palindrome.gettestString(" wow "));

        assertNotEquals("wen gnihtemos", palindrome.gettestString("something new"));
    }

    @Test
    public void fact() {
        assertEquals(new int[]{1},palindrome.getFact(0));

        assertEquals(new int[]{1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600},palindrome.getFact(12));

        assertEquals(new int[]{1,2,6,24,120,720},palindrome.getFact(6));

        assertEquals(new Long[]{1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600,6227020800},palindrome.getFactLong(13));
    }

    @Test
    public void power() {
        assertEquals(1024, palindrome.powerofFour(5));

        assertEquals(1, palindrome.powerofFour(0));

        assertNotEquals(15,palindrome.powerofFour(3));
    }

    @Test
    public void isEven() {
        assertTrue(palindrome.getisEven(2888));

        assertFalse(palindrome.getisEven(567));

        assertTrue(palindrome.getisEven(0));
    }


    @Test
    public void getStudentDetails() {
//        assertEquals(new Student(81,65,98),palindrome.getStudent(4, new int[]{86,65,98,77}));
//        assertSame(new Student(86,86,86),palindrome.getStudent(1, new int[]{86}));
//        assertNull(palindrome.getStudent(0, new int[]{}));
    }
}
