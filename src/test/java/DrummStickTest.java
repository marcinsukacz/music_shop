import org.junit.Before;
import org.junit.Test;
import parts.DrummStick;

import static org.junit.Assert.assertEquals;

public class DrummStickTest {

    DrummStick stick1;

    @Before
    public void before(){
        stick1 = new DrummStick("Drumm stick", 5, 6, "rubber");
    }

    @Test
    public void hasHeadType(){
        assertEquals("rubber", stick1.getHeadType());
    }
}
