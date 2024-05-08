package Operators;

public class LogicalOperatorNOT {
    /*
    AND - &&  --> returns true if all condtions are true
    OR - ||   -->  returns true if any 1 condtion are true
    NOT - !   -->
     */

    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        // returns false --> a is true but we have to print not (a) that is false
        System.out.println(!(10>20));
        // returns true --> not(10>20), 10 is not > 20 true
        System.out.println(!(30>90));
        // true --> not(30>90) --> not(false) is true
        System.out.println(!!(30>90));
        // false --> not(not(30>90)) --> not(not(false)) --> not(true) --> false

    }
}
