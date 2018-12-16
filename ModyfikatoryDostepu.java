import java.sql.SQLOutput;

public class ModyfikatoryDostepu
{
    public static void main(String[] args)
    {
        A a = new A();
        a.setCounter(123);
        System.out.println(a.getCounter());

        B b = new B();
        System.out.println(b.getCounter());

        Rectangle rec = new Rectangle(100,100,"Zielony");
        rec.show();
    }
}

// gdyby bylo final class A to nie moglbym po niej dziedziczyc
class A
{
    protected int counter;
    protected String name;

    public int getCounter()
    {
        return counter;
    }

    public void setCounter(int counter)
    {
        if (counter > 20)
        {
            counter = 20;
            System.out.println("Przekroczyles zakre, counter zmienil automatycznie wartosc");
        } else if (counter < 0)
        {
            System.out.println("Counter nie moze byc mniejszy od 0");
        } else {
            this.counter = counter;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

class B extends A{
    void show()
    {
        // Dostep do zmiennych skladowych jest dlatego ze jest protected
        System.out.println("licznik " + counter);
        System.out.println("licznik " + name);
    }

    @Override
    public int getCounter()
    {
        System.out.println("wywolywanie z klasy B");
        return counter;
    }
}