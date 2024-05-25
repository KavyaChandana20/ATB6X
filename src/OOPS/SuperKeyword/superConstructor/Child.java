package OOPS.SuperKeyword.superConstructor;

public class Child extends Parent
{
    /* If child has DC then it will automatically call Parent Class DC.
          It calls everytime when an obj is created */
    Child()
    {
        {
            System.out.println("Child - Default Constructor");
        }

    }
}
