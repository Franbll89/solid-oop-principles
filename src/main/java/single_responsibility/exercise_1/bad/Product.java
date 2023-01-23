package single_responsibility.exercise_1.bad;

public class Product {

    private final double price;

    public Product(double price) {
        this.price = price;
    }

    public double calculatePriceWithTax(Country country) {
        return price + calculateTax(country);
    }

    private double calculateTax(Country country) {
        return price * country.getVat();
    }

}