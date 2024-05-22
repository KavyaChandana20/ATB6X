package OOPS;

public class ProgDefCons
{
    public static void main(String[] args)
    {
        System.out.println("Constructor is a special method with no return type.");
        System.out.println("Constructor has same name as the className.");
        System.out.println("There will be only 1 default constructor for a class and can be called n times.");
        System.out.println("Default constructor will be called when we create an object of class.");


        DefaultConstructor dc = new DefaultConstructor();
        DefaultConstructor dc1 = new DefaultConstructor();
        DefaultConstructor dc2 = new DefaultConstructor();

        /* output:
          Iam a default constructor
          Iam a default constructor
          Iam a default constructor
         */
    }
}
