package Collections.lists.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class prog3
{
    public static void main(String[] args)
    {
        //using AddAll func
        List<String> l = new ArrayList<>();
        l.add("ATB");
        l.add("MTB");
        l.add("PyATB");
        l.add("SDET Blueprint");

        List l1 = new ArrayList();
        l1.add(150);
        l1.add(100);
        l1.add(100);
        l1.add(399);

        l.addAll(l1);
        System.out.println(l);
        // [ATB, MTB, PyATB, SDET Blueprint, 150, 100, 100, 399]


        ListIterator lt1 = l.listIterator(l.size());
        while(lt1.hasPrevious())
        {
            //l.add("Gen AI");
            lt1.add("Gen AI");
            //System.out.println(lt2.hasPrevious());
        }

        ListIterator lt2 = l.listIterator(l.size());
        while(lt2.hasPrevious())
        {
            //ttacourseList.add("Gen AI");
            lt2.add("Gen AI");
            //System.out.println(lt2.hasPrevious());
        }

    }
}
