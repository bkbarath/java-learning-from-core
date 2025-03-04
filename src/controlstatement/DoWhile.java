package controlstatement;

import java.util.Scanner;

public class DoWhile {

    // You can comment the other functions to explore the specified function
    public static void main(String[] args) {
        firstExample(); // Basic example for do-while loop
        infinityDoWhileLoop(); // Infinity do-while Loop
        example2(); // Example for understanding do-while loop
    }

    // Basic example for do- while Loop
    static void firstExample() {
        int i = 1; // Initialize a value on variable as 1
        do { // Condition for while loop
            System.out.println("The I is: " + i); // This code will be executed until the condition met
            i++; // Increment i value
        } while (i <= 5);
    }

    // Infinity do while loop
    static void infinityDoWhileLoop() {
        do {
            System.out.println("Infinite do-while Value");
        } while (true);
    }

    // Example Two for understanding do-while loop
    static void example2() {
        Scanner scanner = new Scanner(System.in);
        int a; // Declared I
        do {
            // Initial print for
            System.out.println("Addition Calculator (-1 for Exit)");
            System.out.print("Enter a Number: ");
            a = scanner.nextInt(); // Getting value from user

            // If condition for a
            if (a != -1) {

                // Ask another number to perform sum
                System.out.print("Enter a number to sum");
                int b = scanner.nextInt();

                // Print the sum for value
                System.out.println("Sum Of the Values: " + a + b);
            }
            // The while condition
        } while (a == -1);
    }
}
