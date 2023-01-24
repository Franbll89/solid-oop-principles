package open_closed.exercise_1.bad;

public class Hexagon extends Shape{

    private final double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (6*(side*side))/(4*Math.tan(Math.PI/6));
    }
}

