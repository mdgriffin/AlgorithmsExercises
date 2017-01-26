package mdgriffin.me.lab1;
/**
 * Created by t00119683 on 25/01/2017.
 */
public class TestMyMath {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        System.out.println("Max of three: " + myMath.getmaxOfThree(45, 23, 15));

        System.out.println("Calc power: " + myMath.calcPower(2, 4));

        System.out.println("Sum to N: " + myMath.sumToN(100));

        System.out.println("Factorial: " + myMath.calcFactorial(8));

        int[] primeNums = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        int i;

        for (i = 0; i < primeNums.length; i++) {

            if (!myMath.checkIsPrime(primeNums[i])) {
                System.out.println(primeNums[i] + " Is Not a prime number");
                break;
            } else if (i + 1 == primeNums.length) {
                System.out.println("True: All prime");
            }
        }

    }
}
