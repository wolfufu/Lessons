package shapes;

public class Circle extends Shape {

    private final Point center;
    private final double radius;

    public Circle(Point centre, double radius, Color color) {
        super(color);
        this.center = centre;
        this.radius = radius;
    }

    public Point getCenter() { return center; }

    public double getRadius() { return radius; }

    @Override
    public  double getArea() { return radius * radius * Math.PI; }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + getColor() +
                "}";
    }
}
