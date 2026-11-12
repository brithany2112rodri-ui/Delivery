/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lab03
 */
import Model.Packaging;
import Model.BikeDelivery;
import Model.VanDelivery;
import Model.Chargeable;
import java.util.ArrayList;

public class ChargeableController {

    private ArrayList<Chargeable> lista;

    public ChargeableController() {
        lista = new ArrayList<>();
    }

    public void registrarBikeDelivery(String trackingId, int distanceKm) {

        BikeDelivery bike = new BikeDelivery(trackingId, distanceKm);

        lista.add(bike);
    }

    public void registrarVanDelivery(String trackingId, int distanceKm) {

        VanDelivery van = new VanDelivery(trackingId, distanceKm);

        lista.add(van);
    }

    public void registrarPackaging(int items, int chargePerItem) {

        Packaging packaging = new Packaging(items, chargePerItem);

        lista.add(packaging);
    }

    public double calcularTotalGeneral() {

        double total = 0;

        for (int i = 0; i < lista.size(); i++) {

            total = total + lista.get(i).calculateCharge();

        }

        return total;
    }

    public ArrayList<Chargeable> getLista() {

        return lista;
    }
}
