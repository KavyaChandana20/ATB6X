package Operators;

public class increment_decrement {
    public static void main(String[] args) {

        //a++ -> post increment --> First assign/print value 1st then increase
        int a=10;
        int c =a++;
        System.out.println("c value is : "+c); //10
        System.out.println("a value is : "+a); //11

        //++a --> pre increment --> increase value 1st then print/assign
        int b=20;
        int d= ++b;
        System.out.println("d value is : "+d); // 21
        System.out.println("b value is : "+b); //21

        int e=10;
        System.out.print("value of ++e + ++e is : ");
        System.out.println(++e + ++e);  //23 -->  Result1+ Result2
        // Part A -> ++e ,  Result1 = 11, e = 11
        // Part B  -> + ,
        // Part C  -> ++e,  Result2 = 12, e = 12
        System.out.println("e value is : "+e);

        int f = 10;
        System.out.print("value of ++f + f++ + f++ is : ");
        System.out.println(++f + f++ + f++); //34 --> res1 + res2 + res3
        //  Part ->  A -> ++f , res1 = 11 , f = 11
        //  Part ->  B -> f++ , res2 = 11 , f = 12
        //  Part ->  C -> f++,  res3 = 12 , f = 13
        System.out.println("f value is : " +f);

    }
}
