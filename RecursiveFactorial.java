/** doing more recursion stuff with factorials
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-04-19
**/

// imports
import java.io.IOException;
import java.util.Scanner;

public class RecursiveFactorial {

    public static int findFactorial(int intFactorial) {

        // caculating the factorial
        if (intFactorial == 0) {
            return 1;
        } else {
            return(intFactorial * findFactorial(intFactorial - 1));
        }

    }

    public static void main(String[] args) throws IOException {

        // variables
        int intFactorial = 0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("pick a number to find its factorial");
        String stringFactorial = myObj.nextLine();

        while (true) {

            // if the user inputs a number less than 0 then tell them to input a positive number
            try {
                intFactorial = Integer.parseInt(stringFactorial);
                if (intFactorial >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please input a positive number");
            }
            stringFactorial = myObj.nextLine();
        }

        // calling and printing the method
        int factorial = findFactorial(intFactorial);
        System.out.println("your factorial is " + factorial);

    }

}
