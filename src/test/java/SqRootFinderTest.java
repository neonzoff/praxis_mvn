import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqRootFinderTest {

    @Test
    public void testReal() {
        //x^2 + 10x -39 = 0
        SqRootFinder sqRootFinder = new SqRootFinder(1, 10, -39);
        String test = sqRootFinder.solve();
        assertEquals("3,-13", test);
    }

    @Test
    public void testReal2() {
        //x^2 - 4x + 4 = 0
        SqRootFinder sqRootFinder = new SqRootFinder(1, -4, 4);
        String test = sqRootFinder.solve();
        assertEquals("2,2", test);
    }

    @Test
    public void testReal3() {
        //x^2 + 3x - 4 = 0
        SqRootFinder sqRootFinder = new SqRootFinder(1, 3, -4);
        String test = sqRootFinder.solve();
        assertEquals("1,-4", test);
    }

    @Test
    public void testReal4() {
        //x^2 + 14x + 24 = 0;
        SqRootFinder sqRootFinder = new SqRootFinder(1, 14, 24);
        String test = sqRootFinder.solve();
        assertEquals("-2,-12", test);
    }

    @Test
    public void testReal5() {
        //5x^2 - 80 = 0;
        SqRootFinder sqRootFinder = new SqRootFinder(5,0,-80);
        String test = sqRootFinder.solve();
        assertEquals("4,-4",test);
    }

    @Test
    public void testIm() {
        //x^2 -5x + 9 = 0;
        SqRootFinder sqRootFinder = new SqRootFinder(1, -5, 9);
        String test = sqRootFinder.solve();
        assertEquals("Вещественных корней нет", test);
    }

    @Test
    public void testIm2() {
        SqRootFinder sqRootFinder = new SqRootFinder(3, 0, 27);
        String test = sqRootFinder.solve();
        assertEquals("Вещественных корней нет", test);
    }

    @Test
    public void testIm3() {
        SqRootFinder sqRootFinder = new SqRootFinder(121,0,16);
        String test = sqRootFinder.solve();
        assertEquals("Вещественных корней нет",test);
    }
}
