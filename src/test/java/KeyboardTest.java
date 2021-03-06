import instruments.Brand;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard roland1;

    @Before
    public void before(){
        roland1 = new Keyboard("Roland 808", Brand.ROLAND, 100, 120, 48);
    }

    @Test
    public void keyboardHasName(){
        assertEquals("Roland 808", roland1.getName());
    }

    @Test
    public void keyboardHasBrand(){
        assertEquals(Brand.ROLAND, roland1.getBrand());
    }

    @Test
    public void keyboardMadeIn(){
        assertEquals("Japan", roland1.getBrand().madeIn());
    }

    @Test
    public void keyboardHasPriceBought() {
        assertEquals(100, roland1.getPriceBought());
    }

    @Test
    public void keyboardHasSellingPrice() {
        assertEquals(120, roland1.getSellPrice());
    }

    @Test
    public void hasNoOfKeys() {
        assertEquals(48, roland1.getNoOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("keyboard sound", roland1.play() );
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, roland1.calculateMarkup());
    }
}
