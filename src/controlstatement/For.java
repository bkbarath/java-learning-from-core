package controlstatement;

public class For {

    // You can comment the other functions to explore the specified function
    public static void main(String[] args) {
        printTenNumbers(10); // Function for print the numbers
        findFactorial(5); // Function to find factorial
        nestedForLoop(10, 5); // Nested for loop example
        forEachLoop(); // For Each Example
        labeledForLoop(); // Labeled For Loop Example
        infinityForLoop(); // Infinity For Loop Example
    }

    // Print the numbers
    static void printTenNumbers(int number) {
        System.out.println("Print " + number + " numbers");
        // Initialize for loop
        for (int i = 1; i <= number; i++) { // The loop will start from 1 to 10
            // Print each number in a new line for print same line use print instead of println
            System.out.println(i);
        }
    }

    // Function to find factorial value
    static void findFactorial(int number) {
        System.out.println("\nFind Factorial For " + number);
        // initialize 1 as factorial for multiplication if we initialize as 0 means anything multiply by 0 is 0
        int factorial = 1;

        // For loop initialization starts from 1 and ends in number
        for (int i = 1; i <= number; i++) {

            // Multiply each value into factorial
            factorial *= i; // this represent factorial = factorial * i
        }

        // Finally print the factorial value
        System.out.println("Factorial for number " + number + " is " + factorial);
    }

    // nested for loop example
    static void nestedForLoop(int numberI, int numberJ) {
        System.out.println("\nNested For Loop");
        // First For loop
        for (int i = 1; i <= numberI; i++) {
            // Nested for loop
            for (int j = 1; j <= numberJ; j++) { // the loop will run numberI times
                // print i and j
                System.out.println(i + " " + j); // Print will happen numberJ times
            }
        }
    }

    // For Each Loop Example
    static void forEachLoop() {
        System.out.println("\nFor Each Loop");
        // Initialize an Array
        int[] array = {1, 2, 3, 4, 5, 6};

        // For Each Loop initialization
        for (int i : array) {
            System.out.println(i); // print each value from the array
        }
    }

    // Labeled The For Loop
    static void labeledForLoop() {
        System.out.println("\nLabeled For Loop");
        aa:
        // Name the for loop as aa
        for (int i = 1; i <= 5; i++) {
            bb:
            // Named the for loop as bb
            for (int j = 1; j <= 5; j++) {
                if (i == j) { // If the condition is satisfied the inner loop of bb will be break
                    break bb;
                }
                System.out.println(i + " " + j); // Otherwise print the value
            }
        }
    }

    // Infinity For Loop
    static int infinityForLoop() {
        System.out.println("\nInfinity For Loop");
        for (; ; ) { // There Is No Initiators so the for loop will not end until we manually stop by Ctrl+c or stop button in IDE
            System.out.println("Infinity Value"); // Infinity the value will print
        }
    }

}
