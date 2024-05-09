package ImpProgUsingFunc;


public class ReverseString {
    public static void main(String[] args)
    {
        String str = "Hello, world!";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseString(str));
    }

    public static String reverseString(String str)
    {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev.append(str.charAt(i));
        }
        return rev.toString();

    }
}
