package programs.controlstatements.easy;

// Example to find the given number is Positive or Negative
public class PositiveNegative {

    public static void main(String[] args) {

        int number = 21; // Initialize value

        if (number > 0) { // Checks the condition 1
            System.out.println("Positive"); // If condition 1 is true print Positive
        } else if (number < 0) { // Check the condition 2
            System.out.println("Negative"); // If condition 2 is true print Negative
        } else {
            System.out.println("Zero"); // If all the condition is false then print Zero
        }
    }
}
