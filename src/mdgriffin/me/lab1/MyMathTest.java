package mdgriffin.me.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {
    @Test
    public void getmaxOfThree() throws Exception {
        assertEquals(3, MyMath.getMaxOfThree(1,2,3));
        assertEquals(101, MyMath.getMaxOfThree(42, 23, 101));
    }

    @Test
    public void calcPower() throws Exception {
        assertEquals(1, MyMath.calcPower(4, 0), 3);
        assertEquals(8, MyMath.calcPower(8, 1), 3);
        assertEquals(16, MyMath.calcPower(2, 4), 3);
        assertEquals(6433.929, MyMath.calcPower(3.5, 7), 3);
    }

    @Test
    public void sumToN() throws Exception {
        assertEquals(15, MyMath.sumToN(5));
        assertEquals(66, MyMath.sumToN(11));
        assertEquals(325, MyMath.sumToN(25));
    }

    @Test
    public void calcFactorial() throws Exception {
        assertEquals(720, MyMath.calcFactorial(6), 3);
        assertEquals(39916800, MyMath.calcFactorial(11), 3);
    }

    @Test
    public void isPrime() throws Exception {
        int[] primeNums = new int[]{2, 3, 5, 7, 11, 13, 17, 59, 61, 97};

        for (int i =0; i < primeNums.length; i++) {
            assertEquals(true, MyMath.isPrime(primeNums[i]));
        }

        int[] notPrimeNums = new int[]{4, 6, 8, 8, 16, 18, 20, 21, 22};

        for (int j = 0; j < notPrimeNums.length; j++) {
            assertEquals(false, MyMath.isPrime(notPrimeNums[j]));
        }
    }

    @Test
    public void isValidPassword() throws Exception {
        assertEquals(true, MyMath.isValidPassword("Ab1cdefg"));
        assertEquals(false, MyMath.isValidPassword("shorty"));
        assertEquals(false, MyMath.isValidPassword("abcdefghij"));
        assertEquals(false, MyMath.isValidPassword("123456789"));
    }

    @Test
    public void findPrimesInRange() throws Exception {
        assertArrayEquals(new int[]{1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97}, MyMath.findPrimesInRange(100));
    }

}