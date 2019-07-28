package instruments;

public enum Brand {
    ROLAND("Japan"),
    GIBSON("USA"),
    CASIO("Japan"),
    MAUDIO("Germany"),
    FENDER("USA"),
    YAMAHA("Japan"),
    PEARL("UK");

    private final String country;

    Brand(String country) {
        this.country = country;
    }

    public String madeIn() {
        return this.country;
    }
}
