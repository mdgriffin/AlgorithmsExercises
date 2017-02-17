package mdgriffin.me.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void insert() throws Exception {
        int[] arr1 = new int[]{1,2,3,4,5,6,7,0};
        MyArrays.insert(arr1, 7, 9, 3);
        assertArrayEquals(new int[]{1,2,3,9,4,5,6,7}, arr1);

        int[] arr2 = new int[]{45, 67, 2, 101, 54, 0, 0};
        MyArrays.insert(arr2, 5, 22, 0);
        assertArrayEquals(new int[]{22, 45, 67, 2, 101, 54, 0}, arr2);
    }

}