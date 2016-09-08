package com.epam.calculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Olga_Yarmaliuk on 9/7/2016.
 */
public class ManipulationTest {

    private Manipulation manipulation;

    @Before
    public void setUp() throws Exception {
        manipulation = new Manipulation();
    }

    @Test
    public void testAdd() {
        double result = manipulation.add(7, 3);
        assertEquals(result, 10.0, 0);
    }

    @Test
    public void testSubtract() {
        double result = manipulation.subtract(3, 7);
        assertEquals(result, -4.0);
    }

    @Test
    public void testMultiply() {
        double result = manipulation.multiply(3, 0);
        assertEquals(result,0.0, 0 );
    }

    @Test
    public void testDivide() {
        double result = manipulation.divide(3, 0);
        assertNotEquals(result,0.0);
    }
    @Test
    public void testPower() {
        double result = manipulation.power(3, 2);
        assertNotEquals(result, 9);
    }
}

