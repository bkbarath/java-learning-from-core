package programs.controlstatements.hard;

// Example to Print all the prime numbers from 1 to 100
public class PrimeNumbersInARange {

    public static void main(String[] args) {

        // Initialize the For loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                continue;
            }

            // checks whether the number is 2 or three if true print those prime number
            if (i == 2 || i == 3) {
                System.out.print(i + " ");
            }

            // checks the number divisible by 2 or 3 if true skips the loop
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }

            // efficient for loop for figure non-prime numbers
            for (int j = 5; j <= Math.sqrt(i); j = j + 6) {

                // checks the number i divisible by j or j+2 if true then break the
                if (i % j == 0 || i % (j + 2) == 0) {
                    break;
                }
            }

            // if the loop not breaks then print the number
            System.out.print(i + " ");
        }
    }
}
