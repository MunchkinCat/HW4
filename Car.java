package Vehicle;

/**
 * Created by Gabe on 9/21/2016.
 */
public class Car extends Vehicle {
    boolean convertible;

    public Car(){
        super();
        this.convertible = true;

    }

    public void setConvertible(String makeModel, int year, double retailPrice, boolean fourWheelDrive,boolean convertible)
    {
        super.setVehicle(makeModel,year,retailPrice,fourWheelDrive);
        this.convertible = convertible;
    }

    public boolean getConvertible(){
        return this.convertible;
    }



}
