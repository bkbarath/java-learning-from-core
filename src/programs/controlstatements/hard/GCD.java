package programs.controlstatements.hard;


// function to find GCD
public class GCD {

    public static void main(String[] args) {

        // initialize all the variables such as a,b divider, dividend, and reminder
        int a = 15234, b = 6323454, divider, dividend, reminder = 1;

        // set dividend and divider based on the condition
        if (a > b) {
            dividend = a;
            divider = b;
        } else {
            dividend = b;
            divider = a;
        }

        // loop condition until reminder becomes 0
        while (reminder != 0) {

            // get reminder from the dividend
            reminder = dividend % divider;

            // if the reminder is zero then the previous divider is the GCD
            // else set the divider and dividend
            if (reminder != 0) {
                dividend = divider;
                divider = reminder;
            }
        }

        // print the result
        System.out.println("The GCD of the given number is: " + divider);
    }
}
