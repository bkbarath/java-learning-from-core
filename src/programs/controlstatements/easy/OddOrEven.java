package programs.controlstatements.easy;

// Examples to find the given number is Odd Or Even
public class OddOrEven {

    public static void main(String[] args) {
        System.out.println(ifElse(54));
        System.out.println(ternaryOperator(54));
    }

    private static String ifElse(int number) {
        if (number % 2 == 0) { // Check the condition
            return "even"; // The Condition is true then return even
        } else {
            return "odd"; // Condition is false return odd
        }
    }

    private static String ternaryOperator(int number) {
        return number % 2 == 0 ? "even" : "odd";  // Check the condition. The Condition is true then return even. Condition is false return odd
    }
}
