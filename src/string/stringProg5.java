package string;

public class stringProg5 {
    public static void main(String[] args) {
        String s1 = "kavya";

        char c = s1.charAt(3);
        System.out.println("char at 3 is: "+c);
        boolean result = s1.contains("a");
        System.out.println("s1 contains i is : "+result);
        boolean result1 = s1.contains("j");
        System.out.println("s1 contains j is : "+result1);
    }
}
