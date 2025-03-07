package programs.controlstatements.medium;

// Function to get factorial number using for-loop

/* A factorial is a mathematical operation denoted by the symbol "!".
It represents the multiplication of all whole numbers from 1 to a given number*/
public class FactorialNumber {

    public static void main(String[] args) {

        // number for find factorial and factorial is where we store the multiplied value
        int number = 5, factorial = 1;

        // for loop initialization
        for (int i = 1; i <= number; i++) {
            // multiply each value in factorial
            // factorial *= i ==> factorial = factorial * i
            factorial *= i;
        }

        // print factorial value
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
