package BasicProg;

public class prog3 {
    public static void main(String[] args) {
        int num = 9;
        System.out.printf("Your number is -> %d", num);
        System.out.println("Your number is -> " + num);

        float pi = 3.14159f;
        System.out.printf("Your value is  %f",pi);

        // we must use printf when we use %d. %s, %c, %f
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float

        String name = "Kavya";
        System.out.println(name);
        System.out.printf("Your name is -> %s",name + '\n');
        System.out.print("Your name is -> " + name);

    }
}
