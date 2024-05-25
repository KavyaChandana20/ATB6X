package OOPS.inheritance.multilevel_inheritance.example1;

public class prog2
{
    public static void main(String[] args)
    {
        GrandFather g1 = new GrandFather();
        g1.home(); //1bhk

        //grandfather ref has access to father as well as child class --> dynamic dispatch
        GrandFather g2 = new Father(); // creating obj for child class using parent class[grandfather]
        g2.home(); //2bhk

        GrandFather g3 = new Child();  // creating obj for child class using parent class[grandfather]
        g3.home(); //3bhk

        Father f1 = new Child(); // creating obj for child class using parent class[father]
        f1.home();  //3bhk
    }

}
