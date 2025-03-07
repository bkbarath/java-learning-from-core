package programs.controlstatements.easy;

// Example for simple calculator to perform +, -, /, *
public class SimpleCalculator {

    public static void main(String[] args) {
        int a = 12;// Assign A value
        int b = 23; // Assign B value

        String operator = "+"; // Assign Operator

        switch (operator) { // operator will be the expression
            // It checks all the case one by one. while switching if any of case variable
            // is matched with expression that case block of code will be executed
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            // Default case for if none of the case matched then this will be executed
            default:
                System.out.println("The Operator is Invalid");
                break;
        }
    }

}