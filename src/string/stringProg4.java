package string;

public class stringProg4 {
    public static void main(String[] args) {
        String s1 = new String("kavya");
        String s2 = new String("kavya");
        String s3 = new String("kavya");

        System.out.println(s1 == s2);
        /* returns false --> though they have same content as we used 'new'
         they will be created in diff address/location
         the word "new' itself says everytime it will be created in new location*/
        System.out.println(s1.equals(s2));


        System.out.println(" 000 ");
        String a1 = "P";
        String a2 = "P";
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }
}
