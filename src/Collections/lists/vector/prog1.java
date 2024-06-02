package Collections.lists.vector;

import java.util.Vector;

public class prog1
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Anusha");
        v.add("Kiran");
        System.out.println(v);

        v.remove("Kiran");

        System.out.println(v);
    }
}
