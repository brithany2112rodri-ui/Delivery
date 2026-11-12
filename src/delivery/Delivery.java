package delivery;

import Model.*;
import javax.swing.JOptionPane;

public class Delivery {

    public static void main(String[] args) {
        Chargeable packaging 
                = new Packaging(5, 15);
        
        Chargeable bike = new BikeDelivery("B1", 2);
        
        Chargeable van = new VanDelivery("V1", 19);
        
        JOptionPane.showMessageDialog(null, bike.calculateCharge());
    }
    
}
