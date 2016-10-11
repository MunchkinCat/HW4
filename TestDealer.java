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

import static org.junit.Assert.assertEquals;

public class TestDealer {

    @Test
    public void testDealer1() throws IOException {

        Dealer d = new Dealer("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
        d.printDealer();

        d.serializeToFile();

        Inventory i = d.deserializeFromFile();

        Vehicle vOne = d.dealerInventory.getVehicle(0);
        Truck v1 = (Truck) vOne;
        assertEquals("Error desiaralize file to inventory", "Ford", v1.getMakeModel());
        assertEquals("Error desiaralize file to inventory", 2015, v1.getYear());
        assertEquals("Error desiaralize file to inventory", 35_000, v1.getRetailPrice(), 0);

    }

    @Test
    public void testObjectWasSerialized() throws IOException {
        //given
        System.out.println("Testing test object was serialized");
        Dealer d = new Dealer("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
        Vehicle v = new Vehicle("Chevy Silverado", 2, 4, true);


        //when
        d.serializeToFile();
        d.deserializeFromFile();
        Vehicle check = d.dealerInventory.getVehicle(9);

        //then

        assertEquals("Error serializing to makeModel", v.getMakeModel(), check.getMakeModel());
        assertEquals("Error serializing to year", v.getYear(), check.getYear());
        assertEquals("Error serializing to retailprice", v.getRetailPrice(), check.getRetailPrice(), 0);

    }
}
