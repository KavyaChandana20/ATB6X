package TypeCastingProg;

public class explicit {
    public static void main(String[] args) {

        /* int value range is bigger, so it can accept 300 whereas byte stores from-128 to 127
         so if we want to convert int to byte we need explicit casting
         */

        int a1 = 300;
        byte b1 = (byte)a1; // Explicit Casting
        System.out.println("b1 value is : "+b1);
        // 300 -> 32 Bits  0000000000000100101100
        // byte - 8 bits
        // 0 0 1 0 1 1 0 0
        // 44

        int course = 100;
        float GST = 18.45f; //18
        double total = course + (int)GST;
        System.out.println("Total fee including GST is : "+total);

    }
}
