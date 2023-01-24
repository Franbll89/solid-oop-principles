package open_closed.exercise_1.bad.Shapes;

public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getArea() {
        double semiperimeter = (this.getA() + this.getB() + this.getC()) / 2;
        return Math.sqrt(
                semiperimeter *
                        (semiperimeter - this.getA()) *
                        (semiperimeter - this.getB()) *
                        (semiperimeter - this.getC()));
    }
}
