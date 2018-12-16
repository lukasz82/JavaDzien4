import java.awt.*;

public class Test1
{
    public static void main(String[] args)
    {
        pl.edu.wszib.java.PackagePresenter p1 = new pl.edu.wszib.java.PackagePresenter();
        pl.edu.wszbiz.PackagePresenter p2 = new pl.edu.wszbiz.PackagePresenter();

        Test1 test = new Test1();

        System.out.println("pakiet klasy: " + test.getClass().getPackage());

        p1.showPackage();
        p2.showPackage();
    }

}

