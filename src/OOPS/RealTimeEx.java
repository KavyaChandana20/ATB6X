package OOPS;

public class RealTimeEx
{
    public static void main(String[] args)
    {
        Parent t1 = new Test1(); //dynamic dispatch
        t1.setBrowser("edge",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}

class Test1 extends Parent //single inheritance
{
    @Override
    public void setBrowser(String browser, boolean isAuth)  //method overriding
    {
        super.setBrowser(browser, isAuth);
        //System.out.println("I am done");
    }
}

class Parent {
    private String browser;

    public String getBrowser()
    {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) //method over riding and encapsulation
    {
        if (isAuth)
        {
            this.browser = browser;
        }
        else
        {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() //method overloading
    {
        System.out.println("Chrome - Default Browser!!");
    }

    void openBrowser(String browserName) //method over loading
    {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser()
    {
        System.out.println("Open Browser!!");
    }
}
