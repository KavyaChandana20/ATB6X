package BasicProg;

public class MathProg {
    public static void main(String[] args) {
        double sq = Math.sqrt(2);
        System.out.println("square root of 2 is : "+sq);

        int a = Math.abs(-5);
        System.out.println("abs of -5 is : "+a);

        double b = Math.cbrt(3);
        System.out.println("cube root of 3 is : "+b);

        float c= 55.7F, d= 25.3F;
        System.out.println("Max num  is: "+ Math.max(c, d));
        System.out.println("min num is : "+ Math.min(c, d));
        
    }
}
