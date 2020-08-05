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

}
