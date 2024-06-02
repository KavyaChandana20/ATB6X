package Collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class prog2 {
    public static void main(String[] args)
    {
        //List<Integer> l = new ArrayList(); //dynamic dispatch
        ArrayList<Integer> l = new ArrayList(); //this will allow only integer values
        //  l.add("Kavya");
        //  l.add(true);
            l.add(123);

        System.out.println(l);

      //  List<String> l1 = new ArrayList(); //dynamic dispatch
        ArrayList<String> l1 = new ArrayList();
        l1.add("Kavya");
        l1.add("JJJ");
        l1.add("LLL");
        l1.add(null); // we can also add null
        l1.add(null);


        System.out.println("Printing using for each loop");
        for (String str : l1)
        {
            System.out.println(str);
        }


        System.out.println("Printing using for loop");
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }


        System.out.println("Printing using Iterator");
        Iterator<String> itr = l1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }
    }
}
