package programs.controlstatements.hard;

// Function to print 1 to 50 but skip divisible by 3
public class SkipMultiplesOfThree {

    public static void main(String[] args) {

        // initialize the for loop
        for (int i = 1; i <= 50; i++) {

            // check the number divisible by 3
            if (i % 3 == 0) {
                // if true then skip the loop further
                continue;
            }
            // else print the number
            System.out.println(i);

            // Function to print the numbers to skip divisible by 3 without continue statement
            withoutContinue();
        }
    }
    // Function to print the numbers to skip divisible by 3 without continue statement
    private static void withoutContinue() {
        /* initialize the for loop
        If i % 3 == 2 we increment i by 2 else increment by 1
        this step will directly skip the 3 instead of unnecessary iterations
         */
        for (int i = 1; i <= 50; i += (i % 3 == 2) ? 2 : 1) {
            // print the number
            System.out.println(i);
        }
    }
}
