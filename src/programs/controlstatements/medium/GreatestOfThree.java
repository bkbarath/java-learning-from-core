package programs.controlstatements.medium;

// Function to find greatest of three numbers
public class GreatestOfThree {

    public static void main(String[] args) {
        // Assign three values initially
        int a = 41;
        int b = 12;
        int c = 32;
        // If Else method
        greatestNumberUsingIfElse(a, b, c);
        // Ternary Operator Method
        greatestNumberUsingTernary(a, b, c);
    }

    // find the greatest number using if
    private static void greatestNumberUsingIfElse(int a, int b, int c) {

        // First condition checks is the A is Greatest
        if (a > b && a > c) {
            System.out.println("The Greatest Number is: " + a);
            // Second condition checks is the B is Greatest
        } else if (b > a && b > c) {
            System.out.println("The Greatest Number is: " + b);
            // Both condition fails then the else will be executed
        } else {
            System.out.println("The Greatest Number is: " + c);
        }
    }

    // find the greatest number using ternary
    private static void greatestNumberUsingTernary(int a, int b, int c) {

        /* 1. in ternary first A checks with B if the value a is greater than B then
        it will check with c. if A is greater between them then it A is the
        greatest else C is the greatest.

        2. if A is not greater than b then the else part of the main ternary will be executed
        in that if the B is greater than C then B is the greatest value. Else C is the greatest value
         */
        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The Greatest number is: " + greatest);
    }
}
