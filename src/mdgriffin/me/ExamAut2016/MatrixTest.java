package mdgriffin.me.ExamAut2016;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void set() throws Exception {
        Matrix m1 = new Matrix(5, 5);
        m1.set(0, 0, 5);

        assertEquals(m1.get(0, 0), 5, 2);
    }

    @Test
    public void get() throws Exception {
        Matrix m1 = new Matrix(5, 5);
        m1.set(0, 0, 5);

        assertEquals(m1.get(0, 0), 5, 2);
    }

    @Test
    public void fill() throws Exception {
        Matrix m1 = new Matrix(5, 5);
        m1.fill(7);

        assertEquals(7, m1.get(0, 0), 2);
        assertEquals(7, m1.get(2, 2), 2);
        assertEquals(7, m1.get(4, 4), 2);
    }


    @Test
    public void subtract() throws Exception {
        Matrix m1 = new Matrix(5, 5);
        m1.fill(7);


        Matrix m2 = new Matrix(5, 5);
        m2.fill(3);

        Matrix m3 = m1.subtract(m2);

        assertEquals(4, m3.get(0, 0), 2);
    }

}