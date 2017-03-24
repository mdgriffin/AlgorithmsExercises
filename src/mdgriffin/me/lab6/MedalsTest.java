package mdgriffin.me.lab6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedalsTest {
    private Medals medals;
    private int[][] testCounts = {
        { 1, 0, 1 },
        { 1, 1, 0 },
        { 0, 0, 1 },
        { 1, 0, 0 },
        { 0, 1, 1 },
        { 0, 1, 1 },
        { 1, 1, 0 }
    };

    @Before
    public void setUp() throws Exception {
        medals = new Medals();

        for (int row = 0; row < testCounts.length; row++) {
            for (int col = 0; col < testCounts[0].length; col++) {
                medals.set(row, col, testCounts[row][col]);
            }
        }

    }

    @Test
    public void set() throws Exception {
        assertArrayEquals(testCounts, medals.getCounts());
    }

    @Test
    public void sum() throws Exception {
        assertEquals(12, medals.sum());
    }

    @Test
    public void calculateRowTotals() throws Exception {
        assertArrayEquals(new int[]{2, 2, 1, 1, 2, 2, 2}, medals.calculateRowTotals());
    }

    @Test
    public void calculateColumnTotals() throws Exception {
        assertArrayEquals(new int[]{4, 4, 4}, medals.calculateColumnTotals());

    }

}