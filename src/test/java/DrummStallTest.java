import org.junit.Before;
import org.junit.Test;
import parts.DrummStall;

import static org.junit.Assert.assertEquals;

public class DrummStallTest {

    DrummStall drummStall1;

    @Before
    public void before(){
        drummStall1 = new DrummStall("Drumm Stall", 60, 70);
    }

    @Test
    public void hasDescription() {
        assertEquals("Drumm Stall", drummStall1.getDescription());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, drummStall1.calculateMarkup());
    }
}
