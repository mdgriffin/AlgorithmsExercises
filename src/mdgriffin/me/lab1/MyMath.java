package mdgriffin.me.lab1;
/**
 * Created by t00119683 on 25/01/2017.
 */
public class MyMath {
    MyMath () {}

    public int getmaxOfThree (int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public int calcPower (int num, int power) {
        int sum = 1;

        if (power < 0) {
            return -1;
        }

        for (int i =0; i < power; i++) {
            sum *= num;
        }

        return sum;
    }

    public int sumToN(int num) {
        int sum = 0;

        if (num < 1) {
            return -1;
        }

        for (int i = 1;i <= num; i++) {
            sum += i;
        }

        return sum;
    }

    public double calcFactorial (int num) {
        double sum = 1;

        if (num < 1) {
            return -1;
        }

        for (int i = 1;i <= num; i++) {
            sum *= i;
        }

        return sum;
    }

    public boolean checkIsPrime (int num) {
        boolean isPrime = true;

        if (num < 3) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = num / 2;i > 1; i--) {
            if (num % i == 0) {
                return false;
            }
        }

        return isPrime;
    }
}
