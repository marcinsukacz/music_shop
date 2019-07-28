import instruments.Brand;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar gibson1;

    @Before
    public void before(){
        gibson1 = new Guitar("Gibson 1972", Brand.GIBSON, 800, 900, 4);
    }

    @Test
    public void hasNoOfStrings() {
        assertEquals(4, gibson1.getNoOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("guitar sound", gibson1.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100, gibson1.calculateMarkup());
    }
}
