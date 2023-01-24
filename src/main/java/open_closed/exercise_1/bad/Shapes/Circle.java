package open_closed.exercise_1.bad.Shapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return PI * pow(this.getRadius(), 2);
    }
}
