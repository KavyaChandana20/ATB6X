package Collections.lists.stack;

import java.util.Stack;

public class prog1
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.add("D");
        System.out.println(s);

        s.pop(); // removes the last element
       // System.out.println(s.pop()); prints the element that is going to be removed
        System.out.println(s);

        System.out.println(s.peek()); // prints the last element

    }
}
