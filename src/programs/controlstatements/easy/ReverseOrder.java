package programs.controlstatements.easy;

// Example to Print value in reverse order
public class ReverseOrder {

    public static void main(String[] args) {

        // Assign value for number
        int number = 15;

        /* For loop is written slightly different
         * to print the value in reverse we need to initialize i as number
         * we are start from number value. the condition checks to prevent to print negative values
         * we are decrement i value on each iteration to print the  value in reverse*/
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
