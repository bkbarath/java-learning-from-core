package programs.controlstatements.hard;

public class NumberPattern {

    public static void main(String[] args) {
        printStarAsc();
        printStarDesc();
        printPyramid();
    }

    // star pattern from 1 to 5
    private static void printStarAsc() {

        // initialize the main loop
        for (int i = 1; i <= 5; i++) {

            // print empty space and create new line
            System.out.println(" ");

            // inner loop to print the stars with space in right if i = 1 --> print `*`
            // if i =2 print `* *`
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
    }

    // star patter from 5 to 1
    private static void printStarDesc() {

        // initialize main loop
        for (int i = 5; i >= 1; i--) {

            // print empty space and create new line
            System.out.println(" ");

            // inner loop to print the stars with space in right if i = 5 --> print `* * * * *`
            // if i = 4 print `* * * *`
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
    }

    // example to print stars in pyramid shape
    private static void printPyramid() {

        // initialize the rows
        int rows = 5;

        // initialize the main for loop
        for (int i = 1; i <= rows; i++) {

            // the first inner for loop to print spaces
            /* For example for 1 we need 4 spaces from start*/
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // this is second inner loop to print the stars.
            /* For example i = 1 --> it prints `*` ==> 2(1)-1 = 1
              if i = 2 --> it prints `***` ==> 2(2) - 1 = 3  */
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // create new line after printing one line stars
            System.out.println();
        }
    }
}
