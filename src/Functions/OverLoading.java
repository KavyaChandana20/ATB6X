package Functions;

public class OverLoading
{
    //same method name but diff parameters
    public static void main(String[] args)
    {
        sum(10.5, 75.7f);
        sum(7, 5);
        sum(25, 20); // calling the same func again [sum of int func]
        sum(5, 15);
        sum("Kavya",5);
    }

    //func1
    static int sum(int a,int b)
    {
        int res= a+b;
        System.out.println("sum of integers is : " + res); //12  //45 //20
        return res;
    }

    //func2
    static double sum(double a, float b)
    {
        double res= a+b;
        System.out.println("sum of double & float is : " + res); //86.199....
        return res;
    }

    //func3
    static String sum(String a,int b)
    {
        String res= a+b;
        System.out.println("sum of strings is : " + res); //kavya5
        return res;
    }
}
