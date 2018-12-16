public class Rectangle extends ShapeAbstract
{
    private int lenght;
    private int width;

    public Rectangle (int l, int w, String color)
    {
        super(color);
        this.lenght = l;
        this.width = w;
    }

    public void show()
    {
        System.out.println(this.getClass().getSimpleName() + "Kolor: " + getColor());
        System.out.println("Dlugosc: " + this.width);
        System.out.println("Szerokosc: " + this.lenght);
        System.out.println("Pole: " + getArea());
    }

    @Override
    double getArea()
    {
        return lenght * width;
    }


}
