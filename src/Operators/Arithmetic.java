package Operators;

public class Arithmetic {
    //   +, -, *, /, %
    //   = is assignment operator

    public static void main(String[] args) {

        int a = 15, b =3;
       int sum = a+b;
        System.out.printf("Sum is %d", sum);
        System.out.println();

        int sub = a-b;
        System.out.println("subtraction is : " +sub);

        int mul = a*b;
        System.out.println("Multiplication is : " +mul);

        int div = a/b; // 10/34 -> 0.29 -> 0 nad 0.29
        System.out.println("Division is : " +div);

        int mod = a%b;
        System.out.println("modulus is : " +mod );

    }
}