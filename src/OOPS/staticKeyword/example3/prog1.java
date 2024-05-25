package OOPS.staticKeyword.example3;

public class prog1
{
    public static void main(String[] args)
    {
        A a = new A();
        A b = new A();
        //System.out.println(A.age); --> non-static variable age cannot be referenced from a static context
        System.out.println(A.s1); // Static variable called by using class name
        System.out.println(a.s1); // Static variable called by using ref
        System.out.println(b.s1); // Static variable called by using ref

        A.m1(); // Static method called by using class name
        a.m1(); // Static method called by using ref
        b.m1(); // Static method called by using ref


        //A.m2(); --> Non Static method cant be called by using class name
        a.m2();
        b.m2();

        A c= null;
        c.m1();
        /* though c is point to null it cant be accessed as m1 is static.
         static methods are executed hen class is loaded */

        // c.m2(); //Instance can't access --> non-static method
    }
}

class A {
    int age = 10;
    static String s1 = "ABC";
    static {
        System.out.println("SIB-A");
    }
    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
