package OOPS;

public class progAutomation
{
    public static void main(String[] args)
    {
        AutomationClass tc1 = new AutomationClass("TC1");

        AutomationClass tc2 = new AutomationClass("TC2");

        tc1.dataBaseConnection();
        System.out.println("test case name : "+tc1.name);
        tc1.testCase1();
        tc1.testCase2();


        System.out.println("test case name : "+tc2.name);
        tc2.excelOpen();
        tc2.testCase1();
        tc2.testCase2();
    }
}
