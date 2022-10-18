package shapes;

public class Circle {
    private static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Circle.radius * Circle.radius)* Math.PI;
    }

    public double getCircumference() {
        return (2*(Math.PI * Circle.radius));
    }

}
