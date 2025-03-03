package operators;

public class ShiftOperators {
    public static void main(String[] args) {
        System.out.println("Example 1");
        leftShiftOperator();
        System.out.println("Example 2");
        rightShiftOperator();
        System.out.println("Example 3");
        comparison();
    }

    // Left Shift Operator Example
    public static void leftShiftOperator() {
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240
    }

    // Right Shift Operator Example
    public static void rightShiftOperator() {
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2
    }

    // Shift Operator Example: >> vs >>> (unsigned shift)
    public static void comparison() {
        //For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
    }
}
