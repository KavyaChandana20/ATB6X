package Collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset
{
    public static void main(String[] args)
    {
        System.out.println("sets removes duplicate values");
        System.out.println("Hashsets does not maintain the order of insertion");

        Set<String> fruits = new HashSet();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Water Melon");
        //fruits.add(123);
        System.out.println(fruits); //[Apple, Water Melon, Banana]
        System.out.println(fruits.size()); //3
        System.out.println(fruits.isEmpty()); //false
        System.out.println(fruits.contains("Apple")); //true
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits); //[Water Melon, Banana]

        fruits.clear();

        System.out.println(fruits); //[]
        System.out.println(fruits.isEmpty()); //true

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Water Melon");
        System.out.println(fruits);

        System.out.println("Printing using for each");
        for (Object o : fruits)
        {
            System.out.println(o);
        }

        System.out.println("Printing using iterator");
        Iterator i = fruits.iterator();
            while(i.hasNext())
             {
            System.out.println(i.next());
             }


    }
}
