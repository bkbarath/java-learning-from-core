package programs.controlstatements.easy;

// Example to sum first N numbers using for loop
public class SumOfFirstNNumbers {

    public static void main(String[] args) {

        // Assign N number value
        int number = 3;

        // Initialize sum value as 0
        // 0 because of addition
        // if we're going to multiplicative we need to use 1
        // because anything multiply by 0 is 0
        int sum = 0;
        // For loop initialization
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        // Print the summed value
        System.out.println(sum);
    }
}
