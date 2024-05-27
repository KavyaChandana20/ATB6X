package WrapperClass;

public class prog2
{
    public static void main(String[] args)
    {
         int x = 123;
        //String s1 = x; --> string ont accept int values
        //String s1 = (String)x; --> type casting not supported
        String s1 = String.valueOf(x); // wrapper class
        System.out.println(s1);

        Character ch = 'a';
        char ch2 = ch; // Wrapper to Primitive conversion - called as unboxing -it will be done Automatically
        Boolean b = true;
        Long l = 34l;
        Double d = 90.0;
        Float f1 = 90.89f;


        Integer i1 = Integer.valueOf(5);  System.out.println(i1);
        /* Here integer is a rapper class
           i1 is obj ref     */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(4,5));
        System.out.println(Integer.min(1,34));


        double d1 = 90.87;
        // Primtive to Wrapper - valueOf
        String s2 = String.valueOf(d1);
        Double d2= Double.valueOf(d1);
        Integer i2 = Integer.valueOf((int) d1);
        System.out.println(d1);



    }
}
