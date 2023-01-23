package single_responsibility.exercise_1.good;

import org.junit.jupiter.api.Test;
import single_responsibility.exercise_1.bad.Country;
import single_responsibility.exercise_1.bad.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void calculateFrancePrice10WithTax(){
        Product product = new Product(10.0);

        double result = product.calculatePriceWithTax(Country.FRANCE);
        double expected = 12.0;

        assertEquals(expected, result);
    }

    @Test
    public void calculateFrancePrice20WithTax(){
        Product product = new Product( 20.0);

        double result = product.calculatePriceWithTax(Country.FRANCE);
        double expected = 24.0;

        assertEquals(expected, result);
    }

    @Test
    public void calculateSpainPrice10WithTax(){
        Product product = new Product(10.0);

        double result = product.calculatePriceWithTax(Country.SPAIN);
        double expected = 12.1;

        assertEquals(expected, result);
    }

    @Test
    public void calculateGermanyPrice10WithTax(){
        Product product = new Product(10.0);

        double result = product.calculatePriceWithTax(Country.GERMANY);
        double expected = 11.9;

        assertEquals(expected, result);
    }

    @Test
    public void calculateUKPrice10WithTax(){
        Product product = new Product(10.0);

        double result = product.calculatePriceWithTax(Country.UK);
        double expected = 12.0;

        assertEquals(expected, result);
    }

}