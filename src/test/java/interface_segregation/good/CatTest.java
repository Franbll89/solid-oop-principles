package interface_segregation.good;

import interface_segregation.bad.Animal;
import interface_segregation.bad.Cat;
import interface_segregation.bad.LandAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    public void itShouldMeow() {
        Animal cat = new Cat();

        String expected = "meow!";
        String result = cat.talk();
        assertEquals(expected, result);

    }

    @Test
    public void itShouldWalk() {
        LandAnimal cat = new Cat();

        String expected = "the cat is walking!";
        String result = cat.walk();
        assertEquals(expected, result);

    }

}