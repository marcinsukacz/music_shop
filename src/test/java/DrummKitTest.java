import instruments.DrummKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrummKitTest {

    DrummKit kit1;

    @Before
    public void before(){
        kit1 = new DrummKit("Kelp", 1000, 1200);
    }
    @Test
    public void canPlay() {
        assertEquals("bum tap tap", kit1.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(200, kit1.calculateMarkup());
    }

}
