package OOPS.NestedClass;

public class BasicProg
{
    public static void main(String[] args)
    {
        OC.SNIC snic = new OC.SNIC(); // inner Class are accessed using outer Class
        snic.show();
    }
}


class OC //inner Class
{
    static int o = 10;
    int oa = 20;

    static class SNIC // static inner Class
    {
        void show()
        {
            System.out.println(o);
            //System.out.println(oa); --> non static mem cant be accessed inside a static class
        }

    } //SNIC

}  // OC
