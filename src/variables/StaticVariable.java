package variables;

// Static variable
class Student {
    static String name;
}

public class StaticVariable {
    public static void main(String[] args) {

        // These Never happens
        Student staticVariable1 = new Student();
        Student staticVariable2 = new Student();

        // Assigning values
        staticVariable1.name = "Barath";
        staticVariable2.name = "Gopal";

        // Assigning value by using Class
        Student.name = "Java";


        // The output will be Java
        System.out.println("Static Variable 1 Value: " + staticVariable1.name);
        System.out.println("Static Variable 2 Value: " + staticVariable2.name);
    }
}
