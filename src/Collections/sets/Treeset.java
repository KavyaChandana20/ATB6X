package Collections.sets;

import java.util.TreeSet;

public class Treeset
{
    public static void main(String[] args)
    {
        System.out.println("Tree set automatically sorts the set in ascending order");
        System.out.println("Tree set removes the duplicate elements");
        System.out.println("It does not accept null values as it has automatic sorting func, null value cant be sorted or compared");
        TreeSet t = new TreeSet();
        t.add(50);
        t.add(20);
        t.add(10);
        t.add(10);
       // t.add("Kavya");  java.lang.ClassCastException
        //As Treeset has automatic sorting it accepts only one data type either int or string
        System.out.println(t); // 10 20 50

        TreeSet t1 = new TreeSet();
        t1.add("Kavya");
        t1.add("Jehovah");
        t1.add("Aaa");
        t1.add("Zmq");

        System.out.println(t1); //[Aaa, Jehovah, Kavya, Zmq]
    }
}
