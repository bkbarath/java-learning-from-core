package programs.controlstatements.easy;

// Example to print 1 to N numbers
public class Print1ToN {

    public static void main(String[] args) {

        // Initialize number to print from 1 to this number
        int number = 23;

        // Initialize I value for validate to print only from 1 to N number
        int i = 1;
        while (i <= number) { // Condition to check if the is greater than or equal to the N number
            System.out.println(i);
            i++; // increase the to count we are print that much of numbers from 1
        }

    }

    // Do the same with do-while loop
    private static void doWhileLoop() {
        int number = 23;

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= number);

    }

    // Do the same with For loop
    private void forLoop() {
        int number = 23;

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
