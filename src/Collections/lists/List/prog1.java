package Collections.lists.List;

import java.util.List;

public class prog1
{
    public static void main(String[] args)
    {
        // List l = new List(); //-->Error
        // List is an interface. Object creation is not allowed for interface

        List l = List.of("Milk", "Bread", "Butter", "Cheese");
        //List is an interface & "of" is a static func
        // in JVM classloaders will call the List first then static func that is 'of'
        // class loading will be done only once

        System.out.println(l);
        System.out.println(l.size());

        List fruits = List.of("orange", "apple", "banana", "apple", "watermelon");
        System.out.println(fruits);
        System.out.println(fruits.size());


        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("apple"));
        // IsEmpty
        System.out.println(fruits.isEmpty());

        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll


        fruits.add("grapes"); // this line gives "unsupported excepn"
        //classloading is done & exec is going on. so now we cant add an element to list
        //by using ArrayList we can overcome the issue of adding element in the middle of the code.
        System.out.println(fruits);


    }
}
