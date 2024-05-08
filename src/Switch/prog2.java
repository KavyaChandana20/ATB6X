package Switch;

import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program!");

        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();

        switch(browserName){
            default:
                System.out.println("I have no idea which browser is this");
               break;

            case "chrome":
                System.out.println("Starting the chrome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;

        }
        sc.close();
    }
}
