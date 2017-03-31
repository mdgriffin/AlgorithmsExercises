package mdgriffin.me.lab6;

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
        String table = "";

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                table += String.format("%-5d", arr[row][col]);
            }

            table += "\n";
        }

        return  table;
    }

    public static boolean isMagicSquare (int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows != cols) {
            return false;
        }

        // TODO: Read over and understand
        boolean isThere[] = new boolean[rows * cols + 1];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (arr[row][col] < 1 || arr[ row][col]> rows * cols) {
                    return false;
                }

                if (isThere[arr[row][col]]) {
                    return false;
                } else {
                    isThere[arr[row][col]] = true;
                }
            }
        }

        int sum = 0;

        // Loop that tests that all rows and columns sum to the same number
        // TODO: Check the diagonals
        for (int row = 0; row < rows; row++) {
            int rowSum = 0;
            int colSum = 0;

            for (int col = 0; col < cols; col++) {
                rowSum += arr[row][col];
                colSum += arr[col][row];
            }

            if (row == 0) {
                sum = colSum;
            }

            if (colSum != rowSum || rowSum != sum) {
                return false;
            }
        }

        return true;
    }

}
