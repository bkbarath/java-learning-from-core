package variables;

public class InstanceVariable {

    // Instance variables
    public String name;
    public int age =10;

    // Create default constructor to Assign Value
    public InstanceVariable() {
        this.name = "Deepak";
    }

    public static void main(String[] args) {

        // Initialize Object
        InstanceVariable instanceVariable = new InstanceVariable();

        // Print instance values
        System.out.println("Student Name is: "+ instanceVariable.name);
        System.out.println("His Age is: "+ instanceVariable.age);
    }
}
