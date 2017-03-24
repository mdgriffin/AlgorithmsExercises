package mdgriffin.me.lab5;

public class MultiDimensionalArrays {

    public static void checkerboardFill (int[][] arr, int rows, int cols) {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row % 2 == 0) {
                    arr[row][col] = (col % 2 == 0? 1 : 0);
                } else {
                    arr[row][col] = (col % 2 == 0? 0 : 1);
                }
            }
        }

    }

    public static void fillEdge (int[][] arr, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 || col == 0 || row == rows - 1 || col == cols - 1) {
                    arr[row][col] = -1;
                }
            }
        }
    }

    public static String tablePrint (int[][] arr, int rows, int cols) {
        return "";
    }

}
