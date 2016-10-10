package Vehicle;
/**
 * Created by Gabe on 9/21/2016.
 */
public class Truck extends Vehicle{
    boolean SideStep;
    double TowCapacity;

    public Truck(){
        super();
        this.SideStep = true;
        this.TowCapacity = 0;
    }

    public void setTruck(String makeModel, int year, double retailPrice, boolean fourWheelDrive, boolean SideStep,double TowCapacity){
        super.setVehicle(makeModel,year,retailPrice,fourWheelDrive);
        this.SideStep = SideStep;
        this.TowCapacity = TowCapacity;
    }
    public void getTruck(){
        //return this.setTruck;
        System.out.println("fix");
    }
}
