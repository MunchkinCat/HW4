package Vehicle;

import java.io.Serializable;

public class Vehicle implements Serializable{

    String makeModel;
    int year;
    boolean fourWheelDrive;
    double retailPrice;
    double milesPerGallon;



    public Vehicle() {
        this.makeModel = "Ford f350";
        this.year = 1000;
        this.retailPrice = 1.0;
        this.fourWheelDrive = true;
    }

    public Vehicle(String makeModel, int year, double retailPrice, boolean fourWheelDrive){
        this.makeModel = makeModel;
        this.year = year;
        this.retailPrice = retailPrice;
        this.fourWheelDrive = fourWheelDrive;
        this.milesPerGallon= 25;
    }


    public void printVehicle() {
        System.out.println("The make and model of vehicle is as follows:" + this.makeModel);
        System.out.println("The year of the " + this.makeModel + " is " + this.year);
        System.out.println("This model is" + this.fourWheelDrive + " for ");
        System.out.println("The price of" + this.makeModel + "is" + this.retailPrice);
    }



    public void setVehicle(String makeModel, int year, double retailPrice, boolean fourWheelDrive) {
        this.makeModel = makeModel;
        this.year = year;
        this.retailPrice = retailPrice;
        this.fourWheelDrive = fourWheelDrive;
    }


    public String getMakeModel() {
        return this.makeModel;
    }

    public int getYear() {
        return this.year;
    }

    public boolean getFourWheelDrive() {
        return this.fourWheelDrive;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public double getMilesPerGallon() {
        return this.milesPerGallon;
    }

    public String toString() {
        return String.format(" Make: " + this.getMakeModel() + ".%n " +
                "Year: " + this.getYear() + ".%n " +
                "Four Wheel: " + this.getFourWheelDrive() + ".%n " +
                "Retail Price: " + this.getRetailPrice() + ".%n " +
                "Miles Per Gallon: " + this.getMilesPerGallon() + ".%n "
        );
    }
}