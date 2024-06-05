package Collections.Generics;

public class prog2
{
    public static void main(String[] args)
    {
        Test<Integer> i = new Test<Integer>(5);
        System.out.println(i);

        Test<Double> d = new Test<Double>(7.7);
        System.out.println(i);

        Test<String> s = new Test<String>("Kavya");
        System.out.println(s);

    }
}



class Test<T>
{
    T AAA;

    Test(T AAA)
    {
        this.AAA=AAA;

    }
    public T getObject()
    {
        return this.AAA;
    }

}
