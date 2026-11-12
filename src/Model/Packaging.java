package Model;

public class Packaging implements Chargeable{

    private int items;
    private int chargePerItem;

    public Packaging(int items, int chargePerItem) {
        this.items = items;
        this.chargePerItem = chargePerItem;
    }
    
    @Override
    public String label() {
        return "Empaque del pedido";
    }

    @Override
    public int calculateCharge() {
        return items * chargePerItem;
    }
}