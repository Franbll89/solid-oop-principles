package open_closed.exercise_1.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexagonTest {

    @Test
    public void itShouldReturnTheArea() {
        Shape hexagon = new Hexagon(5.0);

        double expected = 64.9519052838329;
        double result = hexagon.getArea();

        assertEquals(expected, result);
    }
}