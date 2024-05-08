package Arrays;

public class initialization3 {
    public static void main(String[] args) {
        final int [] age = new int[4];
        // ages = [0,0,0,0] default value
        // final keyword is for applicable size of the array that is 'age' not for the items in it
        age[3] = 78;
        age[3] = 79;
        System.out.println(age[3]); // 79
    }
}
