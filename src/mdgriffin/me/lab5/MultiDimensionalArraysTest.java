package mdgriffin.me.lab5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdgri on 21/03/2017.
 */
public class MultiDimensionalArraysTest {
    @Test
    public void checkboarderFill() throws Exception {
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

}