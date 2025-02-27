package operators;

public class ANDandOROperators {

    public static void main(String[] args) {
        System.out.println("Example 1");
        ANDOperator1();
        System.out.println("Example 2");
        ANDOperator2();
        System.out.println("Example 3");
        OROperator1();
    }

    // AND Operator Example 1: Logical && vs Bitwise &
    public static void ANDOperator1() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c);//false && true = false
        System.out.println(a < b & a < c);//false & true = false
    }

    // AND Operator Example2: Logical && vs Bitwise &
    public static void ANDOperator2() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b & a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }

    // OR Operator Example: Logical || and Bitwise |
    public static void OROperator1() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);//true || true = true
        System.out.println(a > b | a < c);//true | true = true
        //|| vs |
        System.out.println(a > b || a++ < c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a > b | a++ < c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }


}
