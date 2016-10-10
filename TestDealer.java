/**
 * Created by Gabe on 10/10/2016.
 */
import Vehicle.Vehicle;
import Vehicle.Inventory;
import Vehicle.Car;
import Vehicle.Truck;
import Vehicle.Dealer;
import org.junit.Test;

import java.io.IOException;

public class TestDealer {

    @Test
    public void testDealer1() throws IOException {

        Dealer d = new Dealer("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
        d.printDealer();

        d.serializeToFile();

        Inventory i = d.deserializeFromFile();
        assertEquals("errors getting model", "Ford", i.getMakeModel());
    }

}

