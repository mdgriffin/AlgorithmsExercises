package mdgriffin.me.lab5;

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
}