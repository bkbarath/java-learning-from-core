package programs.controlstatements.medium;

// Function to print the fibonacci series using for loop
public class FibonacciSeries {

    public static void main(String[] args) {

        // initialize the terms
        int terms = 25;

        // initialize previous 1 and previous 2
        int previous1 = 0, previous2 = 1;

        // check the terms is 1
        if (terms == 1) {
            System.out.print(previous1);
            return;
        }

        // if the terms >= 2 then print the first 2 values
        System.out.print(previous1 + " " + previous2 + " ");

        // initialize the loop until terms starts from 2
        for (int i = 2; i < terms; i++) {
            // calculate the current value
            int current = previous1 + previous2;

            // set the previous1 value
            previous1 = previous2;

            // set the previous2 value
            previous2 = current;
            // print the current value
            System.out.print(current + " ");
        }
    }
}
