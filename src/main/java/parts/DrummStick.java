package parts;

public class DrummStick extends SparePart {

    private String headType;

    public DrummStick(String description, int priceBought, int sellPrice, String headType) {
        super(description, priceBought, sellPrice);

        this.headType = headType;
    }

    public String getHeadType() {
        return headType;
    }
}
