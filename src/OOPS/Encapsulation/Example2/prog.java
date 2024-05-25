package OOPS.Encapsulation.Example2;

public class prog
{
    public static void main(String[] args)
    {
        Credentials c = new Credentials("admin","admin123");

        String username = c.getUsername();
        // Code to Auth  isAuth = true
        String password = c.getPassword(true);
        //c.setPassword("kavya",true);
        System.out.println(password);


    }
}
