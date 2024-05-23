package OOPS.staticKeyword;

public class ProgATB
{

    public static void main(String[] args)
    {
        ATB a = new ATB("+919876543210");
        ATB b = new ATB("+123456789");

        a.printDetails();
        b.printDetails();

        System.out.println(ATB.courseName);

    }

}

