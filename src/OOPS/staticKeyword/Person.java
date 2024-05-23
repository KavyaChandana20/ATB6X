package OOPS.staticKeyword;

class Person
{
    static String footBallClub = "PQR"; //Static variable initialization


    static
    {
        System.out.println("Im a static block");
    }

    {
        System.out.println("Im a non static block");
    }

    // Static Func
    static void m1()
    {

        System.out.println("I am a static func - m1");
    }

    // Non Static Func
    void m2()
    {
        System.out.println("Person -> " + this.name);
        System.out.println(footBallClub);
    }


    String name; // non static

    public Person(String name) {
        this.name = name;
    }
}