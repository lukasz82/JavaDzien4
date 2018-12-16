abstract public class ShapeAbstract
{
    ShapeAbstract(String color)
    {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    abstract double getArea();
}
