import Vehicle.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Gabe on 9/23/2016.
 */
public class TestCar {


    @Test
    public void testSetCar() {

        Vehicle C = new Car();
        Car TC = (Car) C;

        ((Car) C).setConvertible("Ford", 1922, 19_000,true, true);
        assertEquals("errors getting model", "Ford", C.getMakeModel());
        assertEquals("Error setting convertible", "true", ((Car) C).getConvertible());
    }}
