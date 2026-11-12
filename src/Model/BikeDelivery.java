package Model;

public class BikeDelivery extends Delivery{

    public BikeDelivery(String trackingId, int distanceKm) {
        super(trackingId, distanceKm); // referencia al constructor del padre
    }

    @Override
    protected int ratePerKm() {
        return 8;
    }
    
}
