package controlstatement;

public class IfElse {
    public static void main(String[] args) {
        ifExample();
        ifElseExample();
        ifElseIfExample();
        nestedIfElse();
    }

    // simple if condition example
    public static void ifExample() {
        int a = 10, b = 20;

        if (a > b) {
            System.out.println("A is the bigger value"); // code block won't execute
        }
    }

    // If - else Example
    static void ifElseExample() {
        int a = 10, b = 20;

        if (a > b) { // false
            System.out.println("A is the bigger value"); // code block won't execute
        } else {
            System.out.println("B is the bigger value"); // code will execute if the `if`- condition is true
        }
    }

    static void ifElseIfExample() {
        int a = 10, b = 20, c = 20;

        if (a > b && a > c) { // false
            System.out.println("A is the bigger value"); // code block won't execute
        } else if (c > a && c > b) { // false
            System.out.println("C is the bigger value"); // code block won't execute
        } else {
            System.out.println("B is the bigger value"); // code will execute if the `if`- condition is true
        }
    }

    static void nestedIfElse() {
        String address = "Delhi, India";

        if (address.endsWith("India")) {
            if (address.contains("Tamil Nadu")) {
                System.out.println("Tamil Nadu"); // IF the address contain Tamil Nadu this code will execute
            } else if (address.contains("Kerala")) {
                System.out.println("Kerala"); // IF the address contain Kerala this code will execute
            } else {
                System.out.println(address.split(",")[0]); // else will take the state from address
            }
        }
    }

}
