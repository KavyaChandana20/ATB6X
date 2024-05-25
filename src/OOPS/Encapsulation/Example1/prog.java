package OOPS.Encapsulation.Example1;

public class prog
{
    public static void main(String[] args)
    {
        System.out.println("Encapsulation - Hiding the data member (variables) of a class");
        System.out.println("Getter & setter methods are to be used for encapsulation");

        ICICIBank i = new ICICIBank("Kavya", 100);
        System.out.println(i.getBal());
        i.setBal(-100);
        System.out.println(i.getBal());

    }
}
