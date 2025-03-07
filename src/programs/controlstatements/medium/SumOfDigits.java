package programs.controlstatements.medium;

// Function to find the sum of digits of a number
public class SumOfDigits {

    public static void main(String[] args) {

        // Initialize the number whose digits need to be summed
        int number = 3242, sum = 0;

        // Loop until the number becomes 0
        while (number > 0) {
            // Extract the last digit of the number
            int lastDigit = number % 10;

            // Add the last digit to the sum
            sum = sum + lastDigit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Print the total sum of the digits
        System.out.println("Sum of digits: " + sum);
    }
}

