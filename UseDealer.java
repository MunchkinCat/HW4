package Vehicle;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Gabe on 10/9/2016.
 */
public class UseDealer implements Serializable{

    public static void main (String[] args){
        String url = "https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt";
        Dealer d = null;
        try {
            d = new Dealer(url);
        } catch(IOException io){
            io.printStackTrace();
        }
        d.printDealer();

    }
}