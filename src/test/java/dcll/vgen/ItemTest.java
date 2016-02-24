package dcll.vgen;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest extends TestCase {
    Item item;
    @Before
    public void setUp() throws Exception {
        item = new Item(2);
    }

    @Test
    public void testConstruct() throws Exception {
        assertEquals(2,item.getVal());
    }

    @Test
    public void testGetVal() throws Exception {
        assertEquals(2,item.getVal());
    }

    @Test
    public void testSetVal() throws Exception {
        item.setVal(3);
        assertEquals(3,item.getVal());
    }
}