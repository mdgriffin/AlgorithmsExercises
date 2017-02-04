package mdgriffin.me.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by t00119683 on 01/02/2017.
 */
public class MyMathTest {
    @Test
    public void getmaxOfThree() throws Exception {
        assertEquals(MyMath.getMaxOfThree(1,2,3), 3);
        assertEquals(MyMath.getMaxOfThree(42, 23, 101), 101);

    }

    @Test
    public void calcPower() throws Exception {
        assertEquals(MyMath.calcPower(4, 0), 1, 3);
        assertEquals(MyMath.calcPower(8, 1), 8, 3);
        assertEquals(MyMath.calcPower(2, 4), 16, 3);
        assertEquals(MyMath.calcPower(3.5, 7), 6433.929, 3);
    }

    @Test
    public void sumToN() throws Exception {
        assertEquals(MyMath.sumToN(5), 15);
        assertEquals(MyMath.sumToN(11), 66);
        assertEquals(MyMath.sumToN(25), 325);
    }

    @Test
    public void calcFactorial() throws Exception {

    }

    @Test
    public void checkIsPrime() throws Exception {
        int[] primeNums = new int[]{2, 3, 5, 7, 11, 13, 17, 59, 61, 97};

        for (int i =0; i < primeNums.length; i++) {
            assertEquals(MyMath.isPrime(primeNums[i]), true);
        }

        int[] notPrimeNums = new int[]{4, 6, 8, 8, 16, 18, 20, 21, 22};

        for (int j = 0; j < notPrimeNums.length; j++) {
            assertEquals(MyMath.isPrime(notPrimeNums[j]), false);
        }

        //assertEquals();
    }

    @Test
    public void validPassword() throws Exception {

    }

}