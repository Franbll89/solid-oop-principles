package open_closed.exercise_1.good;

import open_closed.exercise_1.bad.AreaCalculator;
import open_closed.exercise_1.bad.Rectangle;
import open_closed.exercise_1.bad.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {

    @Test
    public void itShouldReturnRectangleArea() {
        Shape rectangle = new Rectangle(5.0, 6.0);

        double expected = 30.0;
        double result = AreaCalculator.calculateArea(rectangle);

        assertEquals(expected, result);
        
    }
}