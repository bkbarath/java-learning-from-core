package programs.controlstatements.hard;


// function to find given number is Armstrong
public class Armstrong {

    public static void main(String[] args) {

        // initialize the number to find armstrong and armstrong number to store the powered value
        int number = 9474, armstrong = 0;
        // calculate digits of the given number
        int digits = String.valueOf(number).length();

        // condition for the for loop
        /* initialize number as temp and add condition for the temp should be greater than 0 and
        * each iteration removing the last digit */
        for (int temp = number; temp >0; temp /= 10) {
            // get the last digit
            int lastDigit = temp % 10;

            // calculate and store the armstrong value
            armstrong += (int) Math.pow(lastDigit, digits);
        }

        // print the result
        System.out.println("The Given number is: " + (armstrong == number ? "armstrong" : "not a armstrong"));
    }
}
