package BasicProg;

public class prog2 {
    public static void main(String[] args) {
        int a = 45;
        int b = 10;
        String name = "Kavya";

        System.out.println("My name is : "+name);
        System.out.println("addition is : " + (a+b) );
        // if e dont use the () then output ill  be --> addition is:1045

        System.out.println(a+name); //10kavya
        System.out.println(name+b); //kavya45
        System.out.println(a+b+name); //addtion + concat --> 55kavya
        System.out.println(name+a+b); // concat --> kavya1045
        System.out.println(name + (a+b)); // kavya55
        System.out.println(name + (a*b)); // kavya450
        System.out.println(name + (a/b)); // kavya4
        System.out.println(name + (a%b)); // kavya5
    }
}
