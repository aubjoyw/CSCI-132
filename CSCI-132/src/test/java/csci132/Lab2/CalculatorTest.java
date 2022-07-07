package csci132.Lab2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void power_numbers() {
        assertEquals(9, Calculator.power_numbers(3, 2), 0.0000001 );
        assertEquals(3, Calculator.power_numbers(3, 1), 0.0000001 );
        assertEquals(1, Calculator.power_numbers(3, 0), 0.0000001 );
        assertEquals(java.lang.Math.pow(3, -1), Calculator.power_numbers(3, -1), 0.0000001 );
        assertEquals(java.lang.Math.pow(3, -2), Calculator.power_numbers(3, -2), 0.0000001 );
    }
}