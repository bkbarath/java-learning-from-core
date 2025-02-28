package controlstatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] options = {"Select An Option", "1. Print Message", "2. Perform Calculation", "3. Exit"};
        while (true) {
            for (String value : options) {
                System.out.println(value);
            }

            System.out.print("Enter Your Option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("You Have Selected Print Message");
                    scanner.nextLine();
                    System.out.print("Enter Your Message: ");
                    String message = scanner.nextLine();
                    System.out.println("Your Message: " + message);
                    break;
                case 2:
                    System.out.println("You Have Selected Perform Calculation");
                    System.out.print("Enter First Number: ");
                    int number1 = scanner.nextInt();
                    System.out.print("Enter Second Number: ");
                    int number2 = scanner.nextInt();
                    String[] performs = {"+", "-", "*", "/"};

                    System.out.println("Please Select A Option");
                    for (int i = 0; i < performs.length; i++) {
                        System.out.println(i + 1 + ". " + performs[i]);
                    }

                    System.out.print("Select Your Option: ");

                    int perform = scanner.nextInt();
                    int sum = 0;
                    switch (perform) {
                        case 1:
                            sum = number1 + number2;
                            break;
                        case 2:
                            sum = number1 - number2;
                            break;
                        case 3:
                            sum = number1 * number2;
                            break;
                        case 4:
                            sum = number1 / number2;
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }

                    System.out.println("Your Calculated Value: " + sum);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice.\nExiting...");
            }
            if (option >= 3) {
                break;
            }
        }
    }


}
