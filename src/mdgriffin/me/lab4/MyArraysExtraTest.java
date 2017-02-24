package mdgriffin.me.lab4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArraysExtraTest {
    @Test
    public void linearSearch() throws Exception {
        assertEquals(-1, MyArraysExtra.linearSearch(new int[]{27, 9, 102, 56, 73}, 5, 29));
        assertEquals(0, MyArraysExtra.linearSearch(new int[]{1, 23, 9, 3, 46}, 5, 1));
        assertEquals(1, MyArraysExtra.linearSearch(new int[]{1, 23, 9, 3, 46}, 5, 23));
        assertEquals(5, MyArraysExtra.linearSearch(new int[]{45, 1012, 20, 45, 6, 1028}, 6, 1028));
    }

    @Test
    public void merge() throws Exception {
        assertArrayEquals(new int[]{10, 20, 30, 40, 50, 60}, MyArraysExtra.merge(new int[]{10, 20, 30}, 0, 2, new  int[]{40, 50, 60}, 0, 2));
        assertArrayEquals(new int[]{5, 10, 26, 26, 45, 54, 67, 78, 90}, MyArraysExtra.merge(new int[]{10, 26, 45, 54}, 0, 3, new  int[]{5, 26, 67, 78, 90}, 0, 4));
        assertArrayEquals(new int[]{5, 26, 35, 39, 45, 67, 78, 90}, MyArraysExtra.merge(new int[]{7, 35, 39, 45, 63}, 1, 3, new  int[]{5, 26, 67, 78, 90}, 0, 4));
    }

    @Test
    public void selectionSort() throws Exception {

    }

    @Test
    public void insertionSort() throws Exception {

    }

    @Test
    public void binarySearch() throws Exception {

    }
}