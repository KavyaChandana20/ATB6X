package Enum;

public class webPage
{
    public static void main(String[] args)
    {
        page e = page.Login;
        switch (e)
        {
            case Home -> System.out.println("Home Page code should be executed");
            case Login -> System.out.println("Login Page code should be executed");
            case Dashboard -> System.out.println("Dashboard Page code should be executed");
        }
    }
}

enum page
{
    Home, Login, Dashboard
}
