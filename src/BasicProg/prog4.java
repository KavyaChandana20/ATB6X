package BasicProg;

public class prog4
{
    public static void main(String[] args) {

        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word

        System.out.println("Kavya" + '\r' + "Chandana");
        System.out.println("Kavya" + c3 + "Chandana");

        System.out.println("Kavya\tChandana");
        System.out.println("Kavya" + '\b');
    }
}
