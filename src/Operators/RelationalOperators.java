package Operators;

public class RelationalOperators {
    // Relational Operators -> boolean
    // >, < >=,<=, == , !=
    public static void main(String[] args) {
        int a = 100, b =95;

        boolean c = a > b;
        System.out.println("a>b is : "+c); // returns true 100>95

        boolean d = a < b;
        System.out.println("a<b is : "+d); //returns false 100 is not less than 95

        boolean e = a<=b;
        System.out.println("a<=b is : " +e);

        boolean f = a>=b;
        System.out.println("a>=b is : " +f);

        boolean g = a==b;
        System.out.println("a==b is : " +g);

        boolean h = a!=b;
        System.out.println("a!=b is :" +h);


    }
}
