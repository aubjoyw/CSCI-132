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
        assert Calculator.power_numbers(3, 2) == 9;
        assert Calculator.power_numbers(3, 1) == 3;
        assert Calculator.power_numbers(3, 0) == 1;
        assert Calculator.power_numbers(3, -1) == java.lang.Math.pow(3, -1);
        assert Calculator.power_numbers(3, -2) == java.lang.Math.pow(3, -2);
    }
}