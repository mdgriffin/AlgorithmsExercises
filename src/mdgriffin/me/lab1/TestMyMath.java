package mdgriffin.me.lab1;
/**
 * Created by t00119683 on 25/01/2017.
 */
import java.util.Scanner;

public class TestMyMath {
    public static void main(String[] args) {
        String password;

        Scanner input = new Scanner(System.in);

        System.out.println("Max of three: " + MyMath.getmaxOfThree(45, 23, 15));

        System.out.println("Calc power: " + MyMath.calcPower(2.5, 4));

        System.out.println("Sum to N: " + MyMath.sumToN(100));

        System.out.println("Factorial: " + MyMath.calcFactorial(8));

        int[] primeNums = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        int i;

        for (i = 0; i < primeNums.length; i++) {

            if (!MyMath.checkIsPrime(primeNums[i])) {
                System.out.println(primeNums[i] + " Is Not a prime number");
                break;
            } else if (i + 1 == primeNums.length) {
                System.out.println("True: All prime");
            }
        }


        System.out.print("Please enter a password: ");
        password = input.nextLine();

        while (!MyMath.validPassword(password)) {
            System.out.print(
                    "Invalid password" +
                    "\nPassword must contain at least 8 character, contain upper and lowercase letter and contain at least one digit." +
                    "\nPlease enter password again: "
            );


            password = input.nextLine();
        }


        System.out.println("Password is valid");

    }
}
