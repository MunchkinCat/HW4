import Vehicle.*;
import org.junit.Test;

/**
 * Created by Gabriel on 9/23/16.
 */
public class TestInventory {

    @Test //Mr. Test
    public void testAddToInventoryTruck() {

        Vehicle t = new Truck();
        Truck v1 = (Truck) t;
        Inventory inv = new Inventory();
               inv.add(v1);
        Vehicle check1 = inv.vehicle.get(0);
        Truck check = (Truck) check1;


    }


}

