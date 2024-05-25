package OOPS.Abstraction.example1;

public class firefox extends browser
{
    String openBrowser()
    {
        System.out.println("Starting Firefox ...");
        return "";
    }

    @Override
    String closeBrowser()
    {
        System.out.println("Closing Firefox ...");
        return "";
     }
}
