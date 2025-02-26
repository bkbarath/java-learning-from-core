package operators;

public class UnaryOperator {

    public static void main(String[] args) {
        int a =10;
        System.out.println(a++); // a = 11 which is after printing but print 10
        System.out.println(++a); // a = 12 because it will increase before printing - print 12
    }
}
