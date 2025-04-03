package methods;

import java.util.Scanner;

public class IntegerExample {

    /* first the main method will start executing
     * Then it will jump into the methods/ functions which all are called into it */

    // Main method will start the execution
    public static void main(String[] args) {
        // it will jump into the voidExample method and execute the statements
        voidExample(); // void example which will not return anything

        // return the integer from the method
        int sum = returnInteger();
        System.out.println("Sum of the numbers from Return Integer: " + sum);
    }


    // Example for method
    static void voidExample() {
        // initialize the scanner for getting input from
        Scanner scanner = new Scanner(System.in);

        // get first number
        System.out.print("Enter First Number: ");
        int number1 = scanner.nextInt();

        // get second number
        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();

        // perform sum with the numbers
        int sum = number1 + number2;

        // print the added value
        System.out.println("Sum of the numbers: " + sum);
    }

    // Example for return integer
    static int returnInteger() {
        // initialize the scanner for getting input from
        Scanner scanner = new Scanner(System.in);

        // get first number
        System.out.print("Enter First Number: ");
        int number1 = scanner.nextInt();

        // get second number
        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();

        // perform sum with the numbers
        int sum = number1 + number2;

        // print the added value
        return sum;
    }


}
