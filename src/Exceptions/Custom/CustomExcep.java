package Exceptions.Custom;

public class CustomExcep
{
    public static void main(String[] args) throws Exception
    {
        Bank sbi = new Bank("INR",100);
        Bank jpmorgan = new Bank("USD",10);
        Integer total = sbi.add(jpmorgan);
        //Integer total = sbi.add1(jpmorgan);
        System.out.println(total);

    }
}
