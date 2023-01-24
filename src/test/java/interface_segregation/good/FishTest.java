package interface_segregation.good;

import interface_segregation.bad.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    @Test
    public void itShouldWalk() {
        AquaticAnimal fish = new Fish();

        String expected = "the fish is swimming!";
        String result = fish.swim();
        assertEquals(expected, result);

    }
}