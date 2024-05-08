package Operators;

public class Ternary {
    /* syntax ---> variable = condition ? expression1 : expression2
     if cond is ture print expression1 else print expression2
     */

    public static void main(String[] args) {
        int a= (30>40) ? 10: 20;
        System.out.println("a is : " +a);

        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println("str is : "+str);

        int b = 10;
        int c = 20;
        int max = b<c ? c : b;
        int min = b<c ? b : c;
        System.out.println("max num is: "+max);
        System.out.println("min num is : "+min);

    }
}
