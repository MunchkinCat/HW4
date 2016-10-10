package Vehicle;
import java.io.Serializable;
import java.util.*;

/**
 * Created by Gabe on 9/21/2016.
 */
    public class Inventory implements Serializable{

        public List<Vehicle> vehicle;

    public Inventory()
        {
            this.vehicle = new ArrayList<Vehicle>();
        }

        public void add(Vehicle v)
        {
            this.vehicle.add(v);
        }

        public void remove(Vehicle v)
        {
            this.vehicle.remove(v);
        }


    public Vehicle findCheapestVehicle()
    {
        Vehicle v = null;
        Vehicle vt = null;
        double cheapPrice = 10;
        for (int i = 0; i < this.vehicle.size(); i++)
        {
            v = this.vehicle.get(i);
            if (v.getRetailPrice() < cheapPrice)
            {
                cheapPrice = v.getRetailPrice();
                vt = this.vehicle.get(i);
            }
        }
        return vt;
    }
    public Vehicle findMostExpensiveVehicle()
    {
        Vehicle t1 = null;
        Vehicle vt1 = null;
        double expPrice = 0.0;
        for (int i = 0; i < this.vehicle.size(); i++)
        {
            t1 = this.vehicle.get(i);
            if (t1.getRetailPrice() > expPrice)
            {
                expPrice = t1.getRetailPrice();
                vt1 = this.vehicle.get(i);
            }
        }
        return vt1;
    }
    public void printAveragePriceOfAllVehicles()
    {
        Vehicle t2 = null;
        double avg = 0.0;
        for (int i = 0; i < this.vehicle.size(); i++)
        {
            t2 = this.vehicle.get(i);
            avg += t2.getRetailPrice();
        }
        avg /= this.vehicle.size();
        System.out.println(" $ " + avg);
    };

}