package parts;

import behaviours.ISell;

public abstract class SparePart implements ISell {

    private String description;
    private int priceBought;
    private int sellPrice;

    public SparePart(String description, int priceBought, int sellPrice) {
        this.description = description;
        this.priceBought = priceBought;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup() {
        return this.getSellPrice() - this.getPriceBought();
    }

}
