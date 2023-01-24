package open_closed.exercise_1.good;

import open_closed.exercise_1.bad.Shapes.Rectangle;
import open_closed.exercise_1.bad.Shapes.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void itShouldReturnTheArea() {
        Shape rectangle = new Rectangle(5.0, 6.0);

        double expected = 30.0;
        double result = rectangle.getArea();

        assertEquals(expected, result);
    }
}
