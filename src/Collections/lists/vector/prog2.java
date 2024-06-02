package Collections.lists.vector;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Collections;

public class prog2
{
    public static void main(String[] args)
    {
        Vector<String> v1 = new Vector<>();
        v1.add("ATB");
        v1.add("MTB");
        v1.add("SDET Blueprint");
        System.out.println(v1);
        System.out.println();

        System.out.println("Printing using Enumeration");
        Enumeration e = v1.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println();

        Vector v2 = new Vector<>();
        v2.add(87);
        v2.add(60);
        v2.add(91);
        v2.add(55);
        Collections.sort(v2);
        System.out.println("Printing using Sort method");
        System.out.println(v2); // 55 60 87 91

    }
}
