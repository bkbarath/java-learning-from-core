package programs.controlstatements.medium;

// Reverse the digits of number using while-loop
public class ReverseNumber {

    public static void main(String[] args) {

        // initialize a value
        int number = 125323;

        // create a variable to store the reversed value
        int reversedNumber = 0;

        // create while loop which have the condition
        while (number > 0) {
            // if the condition is true the code will be executed
            // find the last digit because we need the value in reverse
            // in this example need value 323521 as a output

            // first find last digit
            int lastDigit = number % 10;

            // add it with reversed number multiplied by 10 to add next to the current reversed number
            reversedNumber = reversedNumber * 10 + lastDigit;

            // divide by 10 to remove the last digit
            number /= 10;
        }

        // print the reversed number
        System.out.println(reversedNumber);
    }
}
