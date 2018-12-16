public class InstanceCounter
{

    public static void main(String[] args) {

        System.out.println("Ilosc instancji = " + getCount());
        for (int i = 0; i < 100; i++) {
            new InstanceCounter();
        }
        System.out.println("Ilosc instancji = " + getCount());
    }

    InstanceCounter()
    {
        addInstance();
    }

    private static void addInstance()
    {
        numberInstances++;
    }

    public static int getCount()
    {
        return numberInstances;
    }

    private static int numberInstances = 0;
}
