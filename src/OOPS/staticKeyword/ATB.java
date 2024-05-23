package OOPS.staticKeyword;

class ATB
{
    static
    {
        System.out.println("SIB - static initialization block.will executed only once when the Class is LOADED");
    }

    {
        System.out.println("IIB - instance initialization block. Loaded when Object is created");
    }

    String phoneNo; // Non static , Instance Variable
    static String courseName = "ATB"; // Static Variable.
    // if we declare anything as Static then it means that it is common for all


    public ATB(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public void printDetails()
    {
        System.out.println("Your Details -> " + this.phoneNo);
    }

}