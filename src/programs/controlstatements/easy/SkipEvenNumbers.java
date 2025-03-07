package programs.controlstatements.easy;

// Example to Skip Even Numbers
public class SkipEvenNumbers {

    public static void main(String[] args) {

        // Initialize for loop
        for (int i = 1; i < 20; i++) {

            // if condition to check the i is event
            if (i % 2 == 0) {
                continue; // if condition is true then skip
            }
            System.out.println(i); // else print i
        }
    }
}
