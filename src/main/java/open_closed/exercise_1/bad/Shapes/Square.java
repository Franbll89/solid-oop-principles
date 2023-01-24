package open_closed.exercise_1.bad.Shapes;

import static java.lang.Math.pow;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return pow(this.getSide(), 2);
    }
}
