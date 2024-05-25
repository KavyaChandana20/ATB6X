package OOPS.Abstraction.example1;

public class chrome extends browser
{
    String openBrowser()
    {
        System.out.println("Starting CHROME ...");
        return "";
    }

    @Override
    String closeBrowser()
    {
        System.out.println("Closing CHROME ...");
        return "";
    }
}
