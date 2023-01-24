package interface_segregation.good;

import interface_segregation.bad.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {
    @Test
    public void itShouldQuack() {
        Animal duck = new Duck();

        String expected = "quack!";
        String result = duck.talk();
        assertEquals(expected, result);

    }

    @Test
    public void itShouldWalk() {
        LandAnimal duck = new Duck();

        String expected = "the duck is walking!";
        String result = duck.walk();
        assertEquals(expected, result);

    }

    @Test
    public void itShouldSwim() {
        AquaticAnimal duck = new Duck();

        String expected = "the duck is swimming!";
        String result = duck.swim();
        assertEquals(expected, result);

    }

    @Test
    public void itShouldFly() {
        AerialAnimal duck = new Duck();

        String expected = "the duck is flying!";
        String result = duck.fly();
        assertEquals(expected, result);

    }

}