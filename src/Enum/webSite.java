package Enum;

public class webSite
{
    public static void main(String[] args)
    {
        site s = site.Dashboard;
        System.out.println(s.getPage());
        System.out.println(s.getUrl());
    }
}

enum site
{
    Home("https://www.youtube.com/","HomePage"),
   // Login("https://www.youtube.com/gaming","Login"),
    Dashboard("https://www.youtube.com/feed/subscriptions","DashBoard");

    String url, page;

    public String getPage()
    {
        return page;
    }

    site(String url, String page)
    {
        this.url = url;
        this.page = page;
    }

    public String getUrl()
    {
        return url;
    }


}
