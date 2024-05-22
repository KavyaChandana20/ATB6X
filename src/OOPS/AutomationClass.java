package OOPS;

public class AutomationClass
{
    String name;

    AutomationClass(){
        dataBaseConnection();
        excelOpen();
    }

    public AutomationClass(String name) {
        this.name = name;
    }

    void dataBaseConnection(){
        System.out.println("Mysql Connection is created!");
    }

    void excelOpen(){
        System.out.println("Excel opened");
    }

    void testCase1(){
        System.out.println("testCase1 : " + this.name);

    }
    void testCase2(){
        System.out.println("testCase2 : " + this.name);
    }
}
