package Vehicle;
/**
 * Created by Gabe on 10/1/2016.
 */

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.SerializationException;
import org.apache.commons.lang3.SerializationUtils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Dealer {

    private String[] firstVehicleArray;
    private Inventory dealerInventory;

    //deserializing
    public Dealer() {
        this.firstVehicleArray = new String[10];
        this.dealerInventory = new Inventory();
    }

    // serializing
    public Dealer(String grabURL) throws IOException {
        this.firstVehicleArray = new String[10];
        this.dealerInventory = new Inventory();
        this.setVehicleArray(grabURL);
        this.setDealerInventory();

    }

    private void setVehicleArray(String grabURL) throws IOException {
        // Make a URL to the web page
        URL url = new URL(grabURL);
        // Get the input stream through URL Connection
        //"https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt"
        URLConnection connect = url.openConnection();
        InputStream is = connect.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;

        int i = 0;
        // read each line and write to System.out
        do {
            line = br.readLine();
            this.firstVehicleArray[i] = line;
            i++;
        } while (line != null);
//        for ( i = 0; i < firstVehicleArray.length - 1; i++){
//            System.out.println(firstVehicleArray[i]);
//        }
    }

    public void setDealerInventory() {
        int i = 0;
        String makeModel = "";
        //String model ="";
        int year = 0;
        double retailPrice = 0;
        boolean fourWheelDrive = false;

        for (i = 0; i < 9; i++) {
            String urlLine = this.firstVehicleArray[i]; //firstVehicle array has lines of all info per vehicle
            String[] splitOne = urlLine.split(","); // split firstVehicle Array into array called splitOne,
            // element one is makeModel, element two is year, etc.

            //String[] splitmakeModel = splitOne[0].split(" ");
            //make = splitmakeModel[0];
            //model = splitmakeModel[1];
            makeModel = splitOne[0];
            year = Integer.parseInt(splitOne[1]);
            retailPrice = Double.parseDouble(splitOne[2]);
            if (splitOne.length == 4) {
                fourWheelDrive = true;

            } else {
                fourWheelDrive = false;
            }
            Vehicle v = new Vehicle(makeModel, year, retailPrice, fourWheelDrive);
            this.dealerInventory.add(v);
        }
    }
    public void printDealer(){
        int i = 0;
        for (i = 0; i < 9; i++){
            Vehicle v = new Vehicle();
            v = dealerInventory.vehicle.get(i);
            System.out.println(v.getMakeModel()+v.getYear()+v.getFourWheelDrive());
        }
    }
    public void serializeToFile()
    {
        try {
            File file = FileUtils.getFile("C:/Users/Gabe/Desktop/", "Vehicles.txt");
            byte[] data = SerializationUtils.serialize(this.dealerInventory);
            FileUtils.writeByteArrayToFile(file, data);
            System.out.println("seralized");

        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public Inventory deserializeFromFile(){
        File file = FileUtils.getFile("C:/Users/Gabe/Desktop/", "Vehicles.txt");
        byte[] data = null;
        Inventory deserializedInventory = null;
        try{
            data = FileUtils.readFileToByteArray(file);
            deserializedInventory = SerializationUtils.deserialize(data);
            System.out.println("deserialized.");
                    }catch (IOException io){
            io.printStackTrace();
        }catch (SerializationException se){
            se.printStackTrace();
        }
        return deserializedInventory;
    }
}





