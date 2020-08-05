import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImNumberTest {

    @Test
    public void testImNumberInt() {
        ImNumber<Integer> imNumber = new ImNumber<>(5, 2);
        String test = imNumber.toString();
        assertEquals("5+2i", test);
    }

    @Test
    public void testImNumberDouble() {
        ImNumber<Double> imNumber = new ImNumber<>(0.5d, 1.5d);
        String test = imNumber.toString();
        assertEquals("0.5+1.5i", test);
    }

    @Test
    public void testImNumberPlusInt() {
        ImNumber<Integer> imNumber = new ImNumber<>(10, 15);
        ImNumber<Integer> imNumber2 = new ImNumber<>(5, 5);
        String test = imNumber.plus(imNumber2).toString();
        assertEquals("15+20i", test);
    }

    @Test
    public void testImNumberPlusDouble() {
        ImNumber<Double> imNumber = new ImNumber<>(2d, 9d);
        ImNumber<Double> imNumber2 = new ImNumber<>(4d, 1d);
        String test = imNumber.plus(imNumber2).toString();
        assertEquals("6.0+10.0i", test);
    }

    @Test
    public void testImNumberMinusInt() {
        ImNumber<Integer> imNumber = new ImNumber<>(10, 5);
        ImNumber<Integer> imNumber2 = new ImNumber<>(5, 10);
        String test = imNumber.minus(imNumber2).toString();
        assertEquals("5-5i", test);
    }

    @Test
    public void testImNumberMinusDouble() {
        ImNumber<Double> imNumber = new ImNumber<>(2d, 9d);
        ImNumber<Double> imNumber2 = new ImNumber<>(4d, 1d);
        String test = imNumber.minus(imNumber2).toString();
        assertEquals("-2.0+8.0i", test);
    }

    @Test
    public void testImNumberMulInt() {
        ImNumber<Integer> imNumber = new ImNumber<>(2, 3);
        ImNumber<Integer> imNumber2 = new ImNumber<>(5, 4);
        String test = imNumber.multiply(imNumber2).toString();
        assertEquals("-2+23i", test);
    }

    @Test
    public void testImNumberMulInt2() {
        ImNumber<Integer> imNumber = new ImNumber<>(2, 3);
        ImNumber<Integer> imNumber2 = new ImNumber<>(5, -7);
        String test = imNumber.multiply(imNumber2).toString();
        assertEquals("31+1i", test);
    }

    @Test
    public void testImNumberMulDouble() {
        ImNumber<Double> imNumber = new ImNumber<>(0.5, 1.5);
        ImNumber<Double> imNumber2 = new ImNumber<>(1.5, -7.5);
        String test = imNumber.multiply(imNumber2).toString();
        assertEquals("12.0-1.5i", test);
    }

    @Test
    public void testImNumberDivInt() {
        ImNumber<Integer> imNumber = new ImNumber<>(1, 3);
        ImNumber<Integer> imNumber2 = new ImNumber<>(2, 1);
        String test = imNumber.divide(imNumber2).toString();
        assertEquals("1+1i", test);
    }

    @Test
    public void testImNumberDivInt2() {
        ImNumber<Integer> imNumber = new ImNumber<>(8, 1);
        ImNumber<Integer> imNumber2 = new ImNumber<>(2, -3);
        String test = imNumber.divide(imNumber2).toString();
        assertEquals("1+2i", test);
    }

    @Test
    public void testImNumberDivDouble() {
        ImNumber<Double> imNumber = new ImNumber<>(3d, 2d);
        ImNumber<Double> imNumber2 = new ImNumber<>(2d, 1d);
        String test = imNumber.divide(imNumber2).toString();
        assertEquals("1.6+0.2i", test);
    }
}
