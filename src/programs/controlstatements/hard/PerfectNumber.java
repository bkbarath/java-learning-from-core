package programs.controlstatements.hard;

// Function to find the perfect number
public class PerfectNumber {

    public static void main(String[] args) {

        // initialized number to find the perfect number
        int number = 28;
        int sum = 0;
        // initialize the for loop
        for (int i = 1; i < number; i++) {

            // checks whether the number divisible by 1
            if (number % i == 0) {
                // if true then add the i into sum
                sum += i;
            }
        }

        // print the number is perfect or not
        System.out.println("Number " + number +
                (number == sum ? " Is A Perfect Number" : " Is Not A Perfect Number"));
    }
}
