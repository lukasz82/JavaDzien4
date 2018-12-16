import java.net.MalformedURLException;
import java.net.URL;

public class CheckExceptionExample
{
    public static void main(String[] args)
    {
        CheckExceptionExample e = new CheckExceptionExample();
        e.urlTesterByTryCatch("http://wsbib.edu.pl");
    }

    public void urlTesterByTryCatch(String urlStr)
    {
        try
        {
            URL url = new URL(urlStr);
            System.out.println("Protokol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException
    {
        URL url = new URL(urlStr);
        System.out.println("Protokol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}

