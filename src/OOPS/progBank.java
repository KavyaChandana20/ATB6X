package OOPS;

public class progBank
{
    public static void main(String[] args)
    {
        Bank a = new Bank();
        a.printDetails(); // prints default constructor values

        Bank hdfc = new Bank(10,"HDFC001","HDFC");
        hdfc.printDetails();

        Bank icici = new Bank(20,"icici003","ICIC");
        icici.printDetails();


    }
}
