package programs.controlstatements.medium;

// Function to calculate number of days in a month using switch
public class MonthDaysCalculator {

    public static void main(String[] args) {
        monthDayCalculator("July");
    }

    private static void monthDayCalculator(String month) {

        // Switch case expression initialization

        /* It checks all the cases one by one where the month match the case
         * block code will be executed*/
        switch (month) {
            case "January":
                System.out.println("January month Contains 31 days");
                break;
            case "February":
                System.out.println("February month Contains 28 days on normal year and 29 days in leap year");
                break;
            case "March":
                System.out.println("March month Contains 31 days");
                break;
            case "April":
                System.out.println("April month Contains 30 days");
                break;
            case "May":
                System.out.println("May month Contains 31 days");
                break;
            case "June":
                System.out.println("June month Contains 30 days");
                break;
            case "July":
                System.out.println("July month Contains 31 days");
                break;
            case "August":
                System.out.println("August month Contains 31 days");
                break;
            case "September":
                System.out.println("September month Contains 30 days");
                break;
            case "October":
                System.out.println("October month Contains 31 days");
                break;
            case "November":
                System.out.println("November month Contains 30 days");
                break;
            case "December":
                System.out.println("December month Contains 31 days");
                break;
            // Default case to figure the exception ivalid numbers
            default:
                System.out.println("Given Month is Not Valid");
                break;
        }
    }
}
