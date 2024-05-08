package TypeCastingProg;

public class implicit {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;     // Implicit Casting -> usually done by JVM ( You don't have to specify)
        int c = (int) a; // Explicit Casting

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
