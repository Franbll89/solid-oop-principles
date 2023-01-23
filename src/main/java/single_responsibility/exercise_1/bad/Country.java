package single_responsibility.exercise_1.bad;

public enum Country {
    GERMANY(0.19),
    SPAIN(0.21),
    FRANCE(0.2),
    UK(0.2);

    private final double vat;

    Country(double vat) {
        this.vat = vat;
    }

    public double getVat() {
        return vat;
    }
}
