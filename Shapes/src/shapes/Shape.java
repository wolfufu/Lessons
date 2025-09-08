package shapes;

public abstract class Shape { // нельзя создавать его экземпляры

    private final Color color;

    public Shape(Color color) { this.color = color; }

    public Color getColor() { return color; }

    public abstract double getArea(); // все неабстрактные классы должны дать ему реализацию
}
