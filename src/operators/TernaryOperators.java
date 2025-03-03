package operators;

public class TernaryOperators {
    public static void main(String[] args) {
        System.out.println("Example 1");
        ternaryOperator1();
        System.out.println("Example 2");
        ternaryOperator2();
    }

    public static void ternaryOperator1() {
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min); // 2
    }

    public static void ternaryOperator2() {
        int a = 10;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min); // 5
    }
}
