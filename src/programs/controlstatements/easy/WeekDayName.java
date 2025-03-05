package programs.controlstatements.easy;

// Switch case example to find Week day based on the input number
public class WeekDayName {

    public static void main(String[] args) {

        int day = 4; // assign a value for the day

        switch (day) { // the day value will be the expression
            /* the case will check each case variable which will be match
             * If the case matches then it will print the appropriate day name*/
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            // In our case the day is 4 then the case 4 block of code will be print which is Wednesday
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            // If none of the cases is not matching, then the default case will be print
            default:
                System.out.println("Given day is invalid");
                break;
        }
    }
}
