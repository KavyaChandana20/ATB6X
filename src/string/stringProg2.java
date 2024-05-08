package string;

public class stringProg2 {
    public static void main(String[] args) {
        /* strings are immutable in nature
         If you want to change the values StringBuilder, StringBuffer. - API,Web Automation */

        String n1 = "Kavya";
        n1= "Chandana";
        System.out.println("name : "+n1); //Chandana
        System.out.println("To lower case : "+n1.toLowerCase()); //chandana

        String n2 = "Chandana";
        n2.toLowerCase();
        System.out.println("name : "+n2);  //Chandana
        n2= n2.toLowerCase();
        System.out.println("name : "+n2); //chandana

    }
}
