package programs.controlstatements.hard;

// Function to find the given number is palindrome
public class Palindrome {

    public static void main(String[] args) {

        // Initialize the number for find palindrome and initialize the reversed number for store reversed values
        int number = 353523, reversedNumber = 0;

        // assign duplicate number from number to do not disturb the original value
        int duplicateNumber = number;

        // condition to run loop
        while (duplicateNumber > 0) {

            // get last digit
            int lastDigit = duplicateNumber % 10;

            // store the last digit 10s of reversed
            reversedNumber = reversedNumber * 10 + lastDigit;

            // store duplicate number with removed last digit
            duplicateNumber /= 10;
        }

        // print is the given number is palindrome or not
        System.out.println("Given Number is: " + (reversedNumber == number ? "palindrome" : "not a palindrome"));
    }
}
