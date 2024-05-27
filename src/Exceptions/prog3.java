package Exceptions;

public class prog3
{
    public static void main(String[] args)
    {
        try
        {
            int a = 0;
            int x = 10 / a;
        }
        catch (Exception e)
        {
            System.out.println("Exit");
        }
        finally
        {
            System.out.println("I am final");
        }
    }
}
