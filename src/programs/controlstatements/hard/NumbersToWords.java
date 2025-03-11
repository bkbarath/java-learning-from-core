package programs.controlstatements.hard;

public class NumbersToWords {

    public static void main(String[] args) {

        // Initialize the number, reverse, duplicate
        int number = 2301, reversed = 0, duplicate = number;

        // run the loop until duplicate becomes 0 to reverse the number
        while (duplicate > 0) {
            reversed = (reversed * 10) + (duplicate % 10);

            // remove the last digit
            duplicate /= 10;
        }

        // find the number
        while (reversed > 0) {

            // find the last digit from reversed number
            int digit = reversed % 10;
            System.out.print(NumberToText(digit) + " ");
            reversed /= 10;
        }
    }

    // print the text from number
    private static String NumberToText(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Invalid Number";
        };
    }
}
