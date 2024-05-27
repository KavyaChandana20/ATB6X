package WrapperClass;

public class prog3
{
    public static void main(String[] args)
    {
        System.out.println("when ever we have wrapper class obj will be created.");
        System.out.println("obj's == looks for address of variable not the content");

        Integer x = 400, y = 400; //output will be not same

        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");


        int a = 5 , b=5;   //output will be same
        if (a == b)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        Integer p = Integer.valueOf(40);
        Integer q = Integer.valueOf(40);

        if (p == q)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        Integer l = Integer.valueOf(10);
        Integer m = 10;
        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        System.out.println(l == m);



    }
}
