package OOPS.Abstraction.example1;

public class prog
{
    public static void main(String[] args)
    {
        System.out.println("Abstraction - Showing only the essential features of an object to the user");
        System.out.println("and hiding the inner details to reduce complexity.");
        System.out.println("Concrete classes will have the implementation");
        System.out.println("we cant create an obj for abstract class");

        System.out.println("");
        System.out.println("***********");
        System.out.println("");

        chrome ch = new chrome();
        ch.openBrowser();
        ch.closeBrowser();
    }
}
