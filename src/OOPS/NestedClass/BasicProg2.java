package OOPS.NestedClass;

public class BasicProg2
{
    public static void main(String[] args)
    {
        outer o= new outer();
        outer.inner oi= o.new inner();
        oi.m2();
    }
}

class outer {
    int a = 10;

    class inner
    {
        void m2()

        {
            System.out.println("Hi im Inner Class. a value is : " + a);
        }
    }
}