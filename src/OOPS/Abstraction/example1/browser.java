package OOPS.Abstraction.example1;

abstract class browser
{
    abstract String openBrowser();
    abstract String closeBrowser();

    void printLog()
    {
        System.out.println("Logs");
    }
}
