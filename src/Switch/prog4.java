package Switch;

public class prog4 {
    public static void main(String[] args) {

        //if we use '->' then 'break' is not required
        System.out.println("1st switch case");
        int itemcode = 010;
        switch (itemcode)
        {
            case 001,002,003 ->  System.out.println("It is Electronic Gadget!");

            case 004,005,007 -> System.out.println("It is Mechanical Gadget!");

            default -> System.out.println("None");
        }

        System.out.println("2nd switch case");
        int item = 10;
        switch (item)
        {
            case 10 -> System.out.println("It's a laptop!");
            case 20 -> System.out.println("It's a desktop!");
            case 30, 40 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

        System.out.println("3rd switch case");
        char ch = 'z';
        switch (ch)
        {
            case 'a', 'e', 'i', 'u', 'o' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }

        System.out.println("4th switch case");
        switch (-1){
            default:
                System.out.println("Default case");
                break;
            case -1:
                System.out.println("case -1");
                break;
            case 9:
                System.out.println("case 9");
                break;
        }
    }
}
