package task1;

public class Square extends Figure {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double areaSquare = side * side;
        return areaSquare;
    }
}