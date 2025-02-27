package operators;

public class UnaryOperator {

    public static void main(String[] args) {
        System.out.println("Example 1");
        unaryExample1();
        System.out.println("Example 2");
        unaryExample2();
        System.out.println("Example 3");
        unaryExample3();
    }

    // Unary Operator Example: ++ and --
    public static void unaryExample1() {
        int x = 10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
    }

    // Unary Operator Example 2: ++ and --
    public static void unaryExample2() {
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
    }

    // Unary Operator Example: ~ and !
    public static void unaryExample3() {
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }
}
