package Functions;

public class Factorial
{
    /* this is recurssion.
    it is a process where a function calls itself as a subroutine.
    This allows the function to be repeated several times, as it can call itself during its execution.
     */

    public static void main(String[] args)
    {
        System.out.println(factorial(7)); //7*6*5*4*3*2*1 = 5040
    }

        static int factorial(int n)
        {
            if (n == 1)
            { return 1; }
            else
            { return n * factorial(n - 1);  }
    }
}

