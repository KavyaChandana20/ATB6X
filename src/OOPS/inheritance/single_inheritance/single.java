package OOPS.inheritance.single_inheritance;

public class single
{
    public static void main(String[] args)
    {
        System.out.println("Printing parent class:");
        dad d = new dad();
        d.show();

        System.out.println("***********");

        System.out.println("Printing child class:");
        child c = new child();
        c.display();
        c.show();

    }
}
