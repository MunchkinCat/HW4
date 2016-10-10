import Vehicle.*;
import org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Gabe on 9/23/2016.
 */
public class TestVehicle {


    @Test
    public void testSetVehicle() {
    Vehicle t = new Vehicle();
        t.setVehicle("gorgon",1998,6789,true);
        assertEquals("Error setting make", "YUMMMMY", t.getMakeModel());
    }




}



