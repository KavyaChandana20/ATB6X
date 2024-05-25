package OOPS.Polymorphism;

public class MethodOverloading
{
    public static void main(String[] args)
    {
        System.out.println("Multiple methods ith same name and diff parameters");
        ML ml = new ML();
        ml.Area(20);
        ml.Area(5,7);
        ml.Area(2.5);

    }
}

class ML
{
    public void Area(int s)
    {
        System.out.println("Area of a square is : "+s*s);
    }

    public void Area(int l, int b)
    {
        System.out.println("Area of a rectangle is : "+l*b);
    }

    public void Area(double c)
    {
        System.out.println("Area of a circle is : "+3.14*c*c);
    }


}
