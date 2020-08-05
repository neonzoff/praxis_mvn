import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    //SumTestes
    @Test
    public void testSumLong() {
        SimpleCalculator<Long> simpleCalculator = new SimpleCalculator<>();
        long test = simpleCalculator.sum(100L,322L);
        assertEquals(422L,test);
    }

    @Test
    public void testSumInt() {
        SimpleCalculator<Integer> simpleCalculator = new SimpleCalculator<>();
        int test = simpleCalculator.sum(10,5);
        assertEquals(15,test);
    }

    @Test
    public void testSumDouble() {
        SimpleCalculator<Double> simpleCalculator = new SimpleCalculator<>();
        double delta = .00000001d;
        double test = simpleCalculator.sum(3.14d,1.86d);
        assertEquals(5d,test,delta);
    }

    @Test
    public void testSumFloat() {
        SimpleCalculator<Float> simpleCalculator = new SimpleCalculator<>();
        float delta = .000001f;
        float test = simpleCalculator.sum(5.17f,4.83f);
        assertEquals(10f,test,delta);
    }


    //test sub
    @Test
    public void testSubLong() {
        SimpleCalculator<Long> simpleCalculator = new SimpleCalculator<>();
        long test = simpleCalculator.sub(-10L, 10L);
        assertEquals(-20L,test);
    }

    @Test
    public void testSubInt() {
        SimpleCalculator<Integer> simpleCalculator = new SimpleCalculator<>();
        int test = simpleCalculator.sub(15,5);
        assertEquals(10,test);
    }

    @Test
    public void testSubDouble() {
        SimpleCalculator<Double> simpleCalculator = new SimpleCalculator<>();
        double delta = 0.0000001;
        double test = simpleCalculator.sub(5.14d,.14d);
        assertEquals(5d,test,delta);
    }

    @Test
    public void testSubFloat() {
        SimpleCalculator<Float> simpleCalculator = new SimpleCalculator<>();
        float delta = 0.00001f;
        float test = simpleCalculator.sub(4.14f,0.14f);
        assertEquals(4f,test,delta);
    }

    //test mul
    @Test
    public void testMulLong() {
        SimpleCalculator<Long> simpleCalculator = new SimpleCalculator<>();
        long test = simpleCalculator.mul(5L,7L);
        assertEquals(35L,test);
    }

    @Test
    public void testMulInt() {
        SimpleCalculator<Integer> simpleCalculator = new SimpleCalculator<>();
        int test = simpleCalculator.mul(7,8);
        assertEquals(56,test);
    }

    @Test
    public void testMulDouble() {
        SimpleCalculator<Double> simpleCalculator = new SimpleCalculator<>();
        double delta = 0.000000001;
        double test = simpleCalculator.mul(0.5d,10d);
        assertEquals(5d,test,delta);
    }

    @Test
    public void testMulFloat() {
        SimpleCalculator<Float> simpleCalculator = new SimpleCalculator<>();
        float delta = 0.0001f;
        float test = simpleCalculator.mul(0.5f,20f);
        assertEquals(10f,test,delta);
    }

    //test div
    @Test
    public void testDivLong() {
        SimpleCalculator<Long> simpleCalculator = new SimpleCalculator<>();
        long test = simpleCalculator.div(144L,12L);
        assertEquals(12L,test);
    }

    @Test
    public void testDivInt() {
        SimpleCalculator<Integer> simpleCalculator = new SimpleCalculator<>();
        int test = simpleCalculator.div(64,8);
        assertEquals(8,test);
    }

    @Test
    public void testDivDouble() {
        SimpleCalculator<Double> simpleCalculator = new SimpleCalculator<>();
        double delta = 0.0000001d;
        double test = simpleCalculator.div(125d,5d);
        assertEquals(25d,test,delta);
    }

    @Test
    public void testDivFloat() {
        SimpleCalculator<Float> simpleCalculator = new SimpleCalculator<>();
        float delta = 0.0001f;
        float test = simpleCalculator.div(1024f,0.5f);
        assertEquals(2048f,test,delta);
    }
}
