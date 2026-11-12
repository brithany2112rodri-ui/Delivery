package Model;

public class VanDelivery extends Delivery {

    public VanDelivery(String trackingId, int distanceKm) {
        super(trackingId, distanceKm);
    }

    @Override
    protected int ratePerKm() {
        return 14;
    }
}
