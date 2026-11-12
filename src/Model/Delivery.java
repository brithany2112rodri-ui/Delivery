package Model;

abstract class Delivery implements Chargeable{
    private String trackingId;
    private int distanceKm;

    public Delivery(String trackingId, int distanceKm) {
        this.trackingId = trackingId;
        this.distanceKm = distanceKm;
    }
    
    public int baseCharge(){
        return 40;
    }
    
    protected abstract int ratePerKm();

    @Override
    public String label() {
        return "Envio a domilicio";
    }

    @Override
    public int calculateCharge() {
        return baseCharge() + distanceKm *
                ratePerKm();
    }
    
    
}



