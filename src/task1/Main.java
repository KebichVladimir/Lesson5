package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны, мм: ");
        Figure square = new Square(scan.nextDouble());
        System.out.println("Площадь квадрата - " + square.getArea() + " мм2");
        System.out.println("\nПлощадь прямоугольника");
        System.out.println("Введите длину, введите ширину, мм ");
        Figure rectangle = new Rectangle(scan.nextDouble(), scan.nextDouble());
        System.out.println("Площадь прямоугольника - " + rectangle.getArea() + " мм2");
        System.out.println("\nПлощадь треугольника");
        System.out.println("Введите высоту, введите длину основания, мм ");
        Figure triangle = new Triangle(scan.nextDouble(), scan.nextDouble());
        System.out.println("Площадь треугольника - " + triangle.getArea() + " мм2");
        System.out.println("\nПлощадь круга");
        System.out.println("Введите радиуc, мм: ");
        Figure circle = new Circle(scan.nextDouble());
        System.out.println("Площадь круга - " + circle.getArea() + " мм2");
    }
}