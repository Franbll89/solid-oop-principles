package single_responsibility.exercise_1.bad;

public class Product {

    private final double price;

    public Product(double price) {
        this.price = price;
    }

    public double calculatePriceWithTax(Country country) {
        return price + price * country.getVat();
    }

}