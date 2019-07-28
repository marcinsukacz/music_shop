package parts;

public class GuitarString extends SparePart{

    private String material;

    public GuitarString(String description, int priceBought, int sellPrice, String material) {
        super(description, priceBought, sellPrice);

        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
