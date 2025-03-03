package operators;

public class ArithmeticOperator {

    public static void main(String[] args) {
        System.out.println("Example 1");
        arithmeticExample1();
        System.out.println("Example 2");
        arithmeticExample2();
    }

    // Arithmetic Operator Examples
    public static void arithmeticExample1() {
        int a = 10;
        int b = 5;
        System.out.println(a + b);//15
        System.out.println(a - b);//5
        System.out.println(a * b);//50
        System.out.println(a / b);//2
        System.out.println(a % b);//0
    }

    public static void arithmeticExample2() {
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); //21
    }
}
