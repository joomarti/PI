public class Circle {
    public static final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getArea() {
        return PI * (radius * radius);
    }

    public static double getCircumference(double radius) {
        return PI * 2 * radius;
    }
}