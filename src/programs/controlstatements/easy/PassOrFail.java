package programs.controlstatements.easy;

// Example to Figure the Student is Pass or Fail based on their Mark
public class PassOrFail {

    public static void main(String[] args) {

        // Assign student mark
        int studentMark = 64;

        if (studentMark >= 40) { // Check the condition
            System.out.println("Pass"); // If the condition is true, print Pass
        } else {
            System.out.println("Fail"); // If the condition is false, print Fail
        }
    }
}
