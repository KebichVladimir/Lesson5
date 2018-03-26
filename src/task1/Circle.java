package task1;

public class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double areaCircle = 3.14 * radius * radius;
        return areaCircle;
    }
}