package mdgriffin.me.lab1;

import java.util.ArrayList;

/**
 * A Utility class of Math Methods
 * @author Michael Griffin
 */

public class MyMath {

    /**
     * Gets the largest of three numbers
     *
     * @param num1  The first comparison number
     * @param num2  The second comparison number
     * @param num3  The third comparison number
     * @return      The largest number of the three
     */

    public static int getMaxOfThree (int num1, int num2, int num3) {
        int max = num1;

        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1) {
            max = num3;
        }

        return max;
    }

    /**
     * Calculates number to a power
     *
     * @param num     The number to calculate
     * @param power   The power
     * @return        The number raised to the power
     */

    public static double calcPower (double num, int power) {
        double sum = 1;

        if (power < 0) {
            return -1;
        }

        for (int i =0; i < power; i++) {
            sum *= num;
        }

        return sum;
    }

    /**
     * Sums a range of numbers from 1 to n
     *
     * @param num  The upper limit of the range
     * @return     The sum of the range
     */

    public static int sumToN(int num) {
        int sum = 0;

        if (num < 1) {
            return -1;
        }

        for (int i = 1;i <= num; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * Calculates the factorial of a number
     *
     * @param num   The number to calculate the factorial of
     * @return      The factorial of the supplied number
     */

    public static double calcFactorial (int num) {
        double sum = 1;

        if (num < 1) {
            return -1;
        }

        for (int i = 1;i <= num; i++) {
            sum *= i;
        }

        return sum;
    }

    /**
     * Check is a number is a prime number
     *
     * @param num The number to check
     * @return    A boolean representing whethere the number is prime or not
     */

    public static boolean isPrime (int num) {
        boolean isPrime = true;
        int range = num / 2;

        if (num > 3) {
            for (int i = 2;i <= range; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return isPrime;
    }

    /**
     * Checks a String to verify that it matches the valid password criteria
     *
     * @param pass The password String to check
     * @return     A boolean representing whether the password is valid or not
     */

    public static boolean isValidPassword (String pass) {
        boolean valid = true;
        int numUpper = 0;
        int numLower = 0;
        int numNumeric = 0;
        char passChar;

        if (pass.length() < 8) {
            return false;
        }

        for (int i = 0; i < pass.length(); i++) {
            passChar = pass.charAt(i);

            if (passChar >= 'A' && passChar <= 'Z') {
                numUpper++;
            } else if (passChar >= 'a' && passChar <= 'z') {
                numLower++;
            } else if (passChar >= '1' && passChar <= '9') {
                numNumeric++;
            }
        }

        if (numUpper < 1 || numLower < 1 || numNumeric < 1) {
            return false;
        }

        return valid;
    }


    public static ArrayList<Integer> findPrimesInRange (int upperLimit) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> checkRange = new ArrayList<>();

        // generate an array of ints from lower limit to upper limit;
        for (int i = 0; i < upperLimit; i++) {
            checkRange.add(i, i + 2);
        }

        // Loop over the checkRange
        // starting at 2, remove any multiples of 2
        // Continue until you reach the square root of the upperlimit

        return result;
    }
}
