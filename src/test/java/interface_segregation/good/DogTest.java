package interface_segregation.good;

import interface_segregation.bad.Animal;
import interface_segregation.bad.Cat;
import interface_segregation.bad.Dog;
import interface_segregation.bad.LandAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {
    @Test
    public void itShouldWoof() {
        Animal dog = new Dog();

        String expected = "woof!";
        String result = dog.talk();
        assertEquals(expected, result);

    }

    @Test
    public void itShouldWalk() {
        LandAnimal dog = new Dog();

        String expected = "the dog is walking!";
        String result = dog.walk();
        assertEquals(expected, result);

    }
}