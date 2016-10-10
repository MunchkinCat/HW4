/**
 * Created by Gabe on 9/23/2016.
 */

import Vehicle.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestTruck {
    @Test //TEST FOR THE TRUCK AND SIDESTEP


    public void testSetTruck()
    {

        Vehicle t = new Truck();
        Truck tt = (Truck) t;

        ((Truck) t).setTruck("ford", 2099,2999,true,false, 20);

        assertEquals("Error setting make", "Ford", t.getMakeModel());
        //assertEquals("error setting sidestep", true, t.getSideStep());

    }


}
