package programs.controlstatements.medium;

// Program to find the first number between 1 and 100 that is divisible by both 5 and 7
public class FindFirstDivisibleNumber {

    public static void main(String[] args) {

        // Using a for loop to find the first divisible number
        forLoop();

        // Using a while loop to find the first divisible number
        whileLoop();
    }

    // Method using a for loop
    private static void forLoop() {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 5 and 7
            if (i % 5 == 0 && i % 7 == 0) {
                // Print the first found number and exit the loop
                System.out.println("First divisible number (using for loop) is: " + i);
                break;
            }
        }
    }

    // Method using a while loop
    private static void whileLoop() {
        int i = 1; // Initialize the counter

        // Loop until we reach 100
        while (i <= 100) {
            // Check if the number is divisible by both 5 and 7
            if (i % 5 == 0 && i % 7 == 0) {
                // Print the first found number and exit the loop
                System.out.println("First divisible number (using while loop) is: " + i);
                break;
            }
            i++; // Increment the counter
        }
    }
}

