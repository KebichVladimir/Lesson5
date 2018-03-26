package task1;

public class Rectangle extends Figure {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double areaRectangle = width * height;
        return areaRectangle;
    }
}