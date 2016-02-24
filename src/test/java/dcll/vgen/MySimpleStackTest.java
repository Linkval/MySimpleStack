package dcll.vgen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySimpleStackTest {
    MySimpleStack stack;
    @Before
    public void setUp() throws Exception {
        stack = new MySimpleStack();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0,stack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        stack.push(new Item(2));
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeek() throws Exception {
        stack.push(new Item(2));
        assertEquals(2,stack.peek().getVal());
    }

    @Test
    public void testPop() throws Exception {
        stack.push(new Item(2));
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}