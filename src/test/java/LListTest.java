import org.junit.Test;
import static org.junit.Assert.*;

public class LListTest {

    @Test
    public void testAdd() {
        LList<Integer> list = new LList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        String test = list.toString();
        assertEquals("[1,2,3,4]",test);
    }

    @Test
    public void testSize() {
        LList<Integer> list = new LList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int test = list.size();
        assertEquals(3,test);
    }

    @Test
    public void testSize0() {
        LList<Integer> list = new LList<>();
        int test = list.size();
        assertEquals(0,test);
    }

    @Test
    public void testGetFromEmpty() {
        LList<Integer> list = new LList<>();
        try {
            list.get(0);
        } catch (IndexOutOfRangeException e) {
          //all fine
            assertTrue(true);
        }
    }

    @Test
    public void testGetOutOfSize() {
        LList<Integer> list = new LList<>();
        list.add(1);
        list.add(2);
        try {
            list.get(2);
        } catch (IndexOutOfRangeException e) {
            //all fine
            assertTrue(true);
        }
    }

    @Test
    public void testGet() {
        LList<Integer> list = new LList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        int test = list.get(2);
        assertEquals(0,test);
    }

    @Test
    public void testClear() {
        LList<Integer> list = new LList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.clear();
        int test = list.size();
        assertEquals(0,test);
    }

    @Test
    public void testIsEmpty() {
        LList<Integer> list = new LList<>();
        boolean test = list.isEmpty();
        assertTrue(test);
    }

    @Test
    public void testGetFirstFromEmpty() {
        LList<Integer> list = new LList<>();
        Object test = list.getFirst();
        assertNull(test);
    }

    @Test
    public void testGetFirst() {
        LList<Integer> list = new LList<>();
        list.add(144);
        list.add(1);
        list.add(2);
        int test = list.getFirst();
        assertEquals(144,test);
    }
}
