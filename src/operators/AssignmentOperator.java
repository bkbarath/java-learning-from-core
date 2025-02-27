package operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Example 1");
        assignmentExample1();
        System.out.println("Example 2");
        assignmentExample2();
        System.out.println("Example 3");
        assignmentExample3();
    }

    // assignment Operator Example: ++ and --
    public static void assignmentExample1() {
        int a = 10;
        a += 3;//10+3
        System.out.println(a);
        a -= 4;//13-4
        System.out.println(a);
        a *= 2;//9*2
        System.out.println(a);
        a /= 2;//18/2
        System.out.println(a);
    }

    // assignment Operator Example 2: ++ and --
    public static void assignmentExample2() {
        short a = 10;
        short b = 10;
        //a+=b;//a=a+b internally so fine
        // a=a+b;//Compile time error because 10+10=20 now int
        System.out.println(a);
    }

    // assignment Operator Example: ~ and !
    public static void assignmentExample3() {
        short a = 10;
        short b = 10;
        a = (short) (a + b);//20 which is int now converted to short
        System.out.println(a);
    }
}
