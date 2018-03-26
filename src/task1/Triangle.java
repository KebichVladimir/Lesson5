package task1;

public class Triangle extends Figure {
    private double height;
    private double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        double areaTriangle = 0.5 * height * base;
        return areaTriangle;

    }
}