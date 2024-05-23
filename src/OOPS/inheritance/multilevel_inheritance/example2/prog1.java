package OOPS.inheritance.multilevel_inheritance.example2;

public class prog1 {
    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.openExcelFile();
        t1.openSQLConnection();

        int a = t1.API_VERSION;
        int b = t1.VERSION;
        System.out.println("API_VERSION : "+a);
        System.out.println("VERSION : "+b);

        System.out.println("*******");
        CommonToAll c = new Test();
        c.openExcelFile();
        c.openJSON();
    }
}
