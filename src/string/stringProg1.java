package string;

public class stringProg1 {
    public static void main(String[] args) {
        // the default value of string is null only when we use 'new'
        //String[] name = new String[5]

        String name = "Kavya Chandana";

        System.out.println("Printing name using println -> "+name);
        System.out.printf("Printing name using printf -> %s",name);

        System.out.println("\n -- All the Functions avaiable in String -- ");

        System.out.println("length : "+name.length()); // 14 including space
        System.out.println("To lower case : "+name.toLowerCase()); //kavya chandana
        System.out.println("To upper case : "+name.toUpperCase()); //KAVYA CHANADANA

        System.out.println("string concatenation");
        String str1="Hello";
        String str2="Guys";

        System.out.println("str1 is: "+str1);
        System.out.println("str2 is: "+str2);

        String str3= str1.concat(str2);
        System.out.println("str3 is: "+str3);

        String str4= str1.concat("Kavya");
        System.out.println("str4 is: " +str4);


    }
}
