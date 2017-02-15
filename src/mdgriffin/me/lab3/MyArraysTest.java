package mdgriffin.me.lab3;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by mdgriffin on 15/02/2017.
 */
public class MyArraysTest {
    @Test
    public void sum() throws Exception {
        assertEquals(15, MyArrays.sum(new int[]{2, 10, 3}, 3));
        assertEquals(4329, MyArrays.sum(new int[]{607, 34, 121, 3000, 567}));
    }

    @Test
    public void findMax() throws Exception {
        assertEquals(65, MyArrays.findMax(new int[]{27, 2, 65, 30}, 4));
        assertEquals(121, MyArrays.findMax(new int[]{121, 97, 1, 56}));
    }

    @Test
    public void findMin() throws Exception {
        assertEquals(2, MyArrays.findMin(new int[]{27, 2, 65, 30}, 4));
        assertEquals(32, MyArrays.findMin(new int[]{121, 97, 32, 56}));
    }

    @Test
    public void remove() throws Exception {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        MyArrays.remove(arr, 7, 3);

        assertArrayEquals(new int[]{1,2,3,5,6,7,7}, arr);
    }

}