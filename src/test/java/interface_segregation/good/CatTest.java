package interface_segregation.good;

import interface_segregation.bad.Animal;
import interface_segregation.bad.Cat;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    public void itShouldMeow() {
        Animal cat = new Cat();

        String expected = "meow!";
        String result = cat.meow();
        assertEquals(expected, result);

    }

}