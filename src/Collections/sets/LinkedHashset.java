package Collections.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset
{
    public static void main(String[] args)
    {
        System.out.println("Linked Hashsets maintain the order of insertion");

        Set a = new LinkedHashSet();
        a.add("ATB");
        a.add("ATB");
        a.add("MTB");
        a.add("SDET Blueprint");
        a.add("Java for Testers");
        a.add(null);
        a.add(57);

        System.out.println(a); //[ATB, MTB, SDET Blueprint, Java for Testers, null,57]

        System.out.println("Printing using for each");
        for (Object o : a)
        {
            System.out.println(o);
        }

        System.out.println("Printing using iterator");
        Iterator i = a.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
