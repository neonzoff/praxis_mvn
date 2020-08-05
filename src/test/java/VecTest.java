import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VecTest {

    @Test
    public void testAdd() {
        Vec vec = new Vec(7, 6, 5);
        Vec vec2 = new Vec(3, 4, 5);
        String test = vec.plus(vec2).toString();
        assertEquals("(10,10,10)", test);
    }

    @Test
    public void testAdd2() {
        Vec vec = new Vec(-1,-100,-1000);
        Vec vec1 = new Vec(1,101,1002);
        String test = vec.plus(vec1).toString();
        assertEquals("(0,1,2)",test);
    }

    @Test
    public void testMinus() {
        Vec vec = new Vec(-1,-100,-1000);
        Vec vec1 = new Vec(1,101,1002);
        String test = vec.minus(vec1).toString();
        assertEquals("(-2,-201,-2002)",test);
    }

    @Test
    public void testScalarMult() {
        Vec vec = new Vec(7, 6, 5);
        Vec vec2 = new Vec(3, 4, 5);
        int test = vec.scalarMult(vec2);
        assertEquals(70,test);
    }

    @Test
    public void testVec() {
        Vec vec = new Vec(2,5,7);
        String test = vec.toString();
        assertEquals("(2,5,7)",test);
    }
}
