package test;

import org.junit.Assert;
import org.junit.Test;

import kata.Fibonacci;

public class FibonacciTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }
    
    
    @Test
    public void test() throws Exception {
    	Assert.assertEquals(0, Fibonacci.fibo(0));
    	Assert.assertEquals(1, Fibonacci.fibo(1));
    	Assert.assertEquals(3, Fibonacci.fibo(4));
        Assert.assertEquals(13, Fibonacci.fibo(7));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testException() {
    	Fibonacci.fibo(-7);
    }
}
