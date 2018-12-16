public class Wyjatki
{
    public static void main(String[] args) {
        Wyjatki wyjatek = new Wyjatki();
        wyjatek.method1();
    }

    void method1()
    {
        method2();
    }

    void method2()
    {
        method3();
    }

    void method3()
    {
        throw new RuntimeException("Ojeju cos sie zepsulo!!! ");
    }
}


