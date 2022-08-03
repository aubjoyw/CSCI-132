package csci132.Lab6.src.main.java.org.csci132.labs;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fibonacci() {
        Assert.assertEquals(0, Fibonacci.fibonacci(1));
        Assert.assertEquals(1, Fibonacci.fibonacci(2));
        Assert.assertEquals(1, Fibonacci.fibonacci(3));
        Assert.assertEquals(2, Fibonacci.fibonacci(4));
        Assert.assertEquals(3, Fibonacci.fibonacci(5));
        Assert.assertEquals(5, Fibonacci.fibonacci(6));
        Assert.assertEquals(8, Fibonacci.fibonacci(7));
        Assert.assertEquals(13, Fibonacci.fibonacci(8));
        Assert.assertEquals(21, Fibonacci.fibonacci(9));
    }
}