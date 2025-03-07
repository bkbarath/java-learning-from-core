package programs.controlstatements.medium;

// Function to find the given year is leap or not
public class LeapYear {

    public static void main(String[] args) {
        // Initialize year
        int year = 2024;

        /* How to calculate leap year:
        1. year divisible by 4 and cannot be divisible by 100
        2. year divisible by 400
         */

        /* in this condition we check both the condition using && and || logical operators*/
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " Year is Leap Year");
        } else {
            System.out.println(year + " Year is Not Leap Year");
        }
    }
}
