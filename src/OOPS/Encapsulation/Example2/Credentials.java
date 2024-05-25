package OOPS.Encapsulation.Example2;

public class Credentials
{
    private String username;
    private String password;

    public Credentials(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if(isAuth)
        {
            return password;
        }
        else
        {
            return "Not Allowed";
        }
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth)
        {
            this.password = password;
        }
        else
        {
            System.out.println("Not Allowed");
        }
    }
}
