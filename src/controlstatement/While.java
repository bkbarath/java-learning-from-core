package controlstatement;

public class While {

    // You can comment the other functions to explore the specified function
    public static void main(String[] args) {
        firstExample(); // Basic example for while loop
        infinityWhileLoop(); // Infinity While Loop
    }

    // Basic example for while Loop
    static void firstExample() {
        int i = 1; // Initialize a value on variable as 1
        while (i <= 5) { // Condition for while loop
            System.out.println("The I is: " + i); // This code will be executed until the condition met
            i++; // Increment i value
        }
    }

    // Infinity While Loop
    static void infinityWhileLoop() {
        /* The condition for that while loop is always true
         so the loop will be executed infinity to break the
         execution need to add condition */
        while (true) {
            System.out.println("Infinity Loop Value");
        }
    }
}
