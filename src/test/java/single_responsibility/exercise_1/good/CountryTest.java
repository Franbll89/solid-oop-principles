package single_responsibility.exercise_1.good;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import single_responsibility.exercise_1.bad.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    @Test
    public void shouldAccessFranceVatFromCountry() {
        Country country = Country.FRANCE;

        double expected = 0.2;
        double result = country.getVat();


        assertEquals(expected, result);
    }

    @Test
    public void shouldAccessSpainVatFromCountry() {
        Country country = Country.SPAIN;

        double expected = 0.21;
        double result = country.getVat();


        assertEquals(expected, result);
    }
}