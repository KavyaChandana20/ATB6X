package OOPS.inheritance.multilevel_inheritance.example1;

public class prog1
{
    public static void main(String[] args)
    {
        GrandFather g = new GrandFather();
        g.home(); //1bhk

        Father f = new Father();
        f.home(); //2bhk

        Child c = new Child();
        c.home(); //3bhk

    }
}
