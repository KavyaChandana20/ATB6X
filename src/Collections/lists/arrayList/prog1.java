package Collections.lists.arrayList;

import java.util.ArrayList;

public class prog1
{
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList(); // child ref --> child obj
      //  List l1 = new ArrayList();  // Parent ref --> child obj
      //  SequencedCollection l2 = new ArrayList(); // Grand Parent ref -> Child Obj
      //  Collection l3 = new ArrayList(); //Grand Grand Parent ref -> Child Obj

        /*This is dynamic dispacth.
          we can also create an obj using dynamic dispatch.
          ArrayList extends List
          List --> SequencedCollection
          SequencedCollection --> Collection

        */

        l.add("Kavya");
        l.add("AAA");
        l.add("BBB");
        l.add("Kavya"); // Duplicate

        System.out.println(l);
        System.out.println("size of array list is : "+l.size());

        l.remove("Kavya");
        // Removes the first occurrence of the specified element from this list
        System.out.println(l);

        l.clear();
        System.out.println("Printing after clearing the contents : ");
        System.out.println(l);
        System.out.println(l.isEmpty()); //true

        l.add("Kavya");
        l.add("AAA");
        l.add("BBB");
        l.add("Kavya"); // Duplicate
        l.add(null); // we can also add null
        l.add(null);
        System.out.println("printing after adding again :");
        System.out.println(l);


        l.set(3, "Kavya Ch");
        System.out.println("appending Ch to Kavya by using set method");
        System.out.println(l);
        System.out.println("");
        l.add(123);
        l.add(true);

        l.indexOf(123);
        System.out.println(l);

        System.out.println("");
        System.out.println("Printing using for each loop ");
        for (Object k : l)
        {
            System.out.println(k);
        }

        System.out.println("Printing using for loop ");
        for (int i = 0; i < l.size(); i++)
        {
            System.out.println(l.get(i));
        }
    }
}
