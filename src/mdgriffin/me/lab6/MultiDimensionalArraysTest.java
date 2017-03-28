package mdgriffin.me.lab6;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiDimensionalArraysTest {
    @Test
    public void checkerboardFill() throws Exception {
        int[][] arr = new int[4][4];
        int[][] checkeredArr = {
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 1, 0, 1}
        };

        MultiDimensionalArrays.checkerboardFill(arr, 4, 4);

        assertArrayEquals(arr, checkeredArr);
    }

    @Test
    public void fillEdge () throws Exception {
        int[][] arr = new int[4][4];
        int[][] edgedArr = {
                {-1, -1, -1, -1},
                {-1, 0, 0, -1},
                {-1, 0, 0, -1},
                {-1, -1, -1, -1}
        };

        MultiDimensionalArrays.fillEdge(arr, 4, 4);

        assertArrayEquals(arr, edgedArr);

    }

    @Test
    public void isMagicSquare () throws  Exception {
        int[][] arr = {
            {16, 3, 2, 13},
            {5, 10, 11, 8},
            {9, 6, 7, 12},
            {4, 15, 14, 1}
        };

        int[][] arr2 =  {
            {3, 16, 2, 13},
            {5, 9, 11, 8},
            {9, 6, 7, 12},
            {4, 15, 14, 1}
        };

        assertEquals(true, MultiDimensionalArrays.isMagicSquare(arr, 4, 4));
        assertEquals(false, MultiDimensionalArrays.isMagicSquare(arr2, 4, 4));

    }
}