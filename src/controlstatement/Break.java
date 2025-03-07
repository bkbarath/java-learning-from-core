package controlstatement;

public class Break {

    // You can comment the other functions to explore the specified function
    public static void main(String[] args) {
        basicExample();
    }

    // Basic Example For Break
    static void basicExample() {
        // For loop Initialization
        for (int i = 0; i < 5; i++) {
            // If Condition
            if (i == 3) {
                // Is the condition is true the loop will be ended
                break;
            }
            // If the condition is false this code will be executed
            System.out.println(i);
        }
    }

}
