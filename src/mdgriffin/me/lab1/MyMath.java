package mdgriffin.me.lab1;
/**
 * Created by t00119683 on 25/01/2017.
 */
public class MyMath {

    public static int getMaxOfThree (int num1, int num2, int num3) {
        int max = num1;

        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1) {
            max = num3;
        }

        return max;
    }

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
}
