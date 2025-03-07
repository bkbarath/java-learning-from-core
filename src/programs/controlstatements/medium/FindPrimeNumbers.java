package programs.controlstatements.medium;

// function to find the number is prime number
public class FindPrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrime(33));
        System.out.println(isPrimeAdv(33));
    }

    /* find the number is prime or not. this function suites for small numbers with
    for larger number Time complexity will increase
     */
    private static String isPrime(int number) {

        // initial condition if the number is 1 then return not a prime
        // 1 is not a prime number
        if (number == 1) {
            return "not a prime";
        }

        // loop until number - 1 if we run until number the condition will always true
        for (int i = 2; i < number; i++) {
            // check the condition is satisfied
            if (number % i == 0) {
                // if the condition is true then return not a prime
                return "not a prime";
            }
        }
        // else return as prime
        return "prime";
    }

    /* The advance method to find is the number is prime or not
    this handles the time complexity
     */
    private static String isPrimeAdv(int number) {

        // initially check number is 1
        if (number == 1) {
            return "not a prime";
        }

        // checks the number is 2 or 3 both are prime numbers
        if (number == 2 || number == 3) {
            return "prime";
        }

        /* checks the number divisible by 2 or 3
        if the condition is satisfied the number is not a prime number
         */
        if (number % 2 == 0 || number % 3 == 0) {
            return "not a prime";
        }

        /*loop with advance level of math.sqrt
        the loop starts with 5 because already tested until 4
         */
        for (int i = 5; i <= Math.sqrt(number); i = i + 6) {

            // check if the number is divisible by i pr i + 2
            if (number % i == 0 || number % (i + 2) == 0) {
                // the condition is satisfied number is not a prime
                return "not a prime";
            }
        }
        // otherwise the number is prime
        return "prime";
    }
}
