import instruments.Brand;
import instruments.Guitar;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;
import parts.DrummStick;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar gibson1;
    DrummStick stick1;
    Keyboard roland1;

    @Before
    public void before(){

        shop = new Shop();
        gibson1 = new Guitar("Gibson 1972", Brand.GIBSON, 800, 900, 4);
        roland1 = new Keyboard("Roland 808", Brand.ROLAND, 100, 120, 48);
        stick1 = new DrummStick("Drumm stick", 5, 6, "rubber");

    }

    @Test
    public void stackStartsEmpty(){
        assertEquals(0, shop.numOfItems());
    }

    @Test
    public void canAddInstrument(){
        shop.add(gibson1);
        assertEquals(1, shop.numOfItems());
    }

    @Test
    public void canAddSparePart(){
        shop.add(stick1);
        assertEquals(1, shop.numOfItems());
    }

    @Test
    public void canRemoveItem() {
        shop.add(stick1);
        shop.add(gibson1);
        shop.remove(stick1);
        assertEquals(1, shop.numOfItems());


    }

    @Test
    public void canShowMaxPotentialProfit() {
        shop.add(stick1);
        shop.add(gibson1);
        assertEquals(101, shop.showPotentialProfit());

    }
}
