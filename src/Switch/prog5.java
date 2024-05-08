package Switch;

public class prog5 {
    public static void main(String[] args) {
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;
                /* yield is a keyword which basically says return the value 65,
                  the whole code will be replaced by 65.
                 Generally in switch case we are printing [sop] the value
                 but no by using yield we are returning the value */
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw  new IllegalStateException("Error");
        };
        System.out.println(val);  //65
    }
}
