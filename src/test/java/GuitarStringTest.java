import org.junit.Before;
import org.junit.Test;
import parts.GuitarString;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString string1;

    @Before
    public void before(){
        string1 = new GuitarString("Guitar string", 5, 7, "nylon");
    }

    @Test
    public void hasMaterialType(){
        assertEquals("nylon", string1.getMaterial());
    }
}
