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

    public static boolean isMagicSquare (int[][] arr, int rows, int cols) {
        boolean magicSquare = true;

        for (int i = 0; i < rows * cols; i++) {
            boolean indexFound = false;

            one_arr_iteration:
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if ((i + 1) == arr[row][col]) {
                        indexFound = true;
                        break one_arr_iteration;
                    }
                }
            }

            if (!indexFound) {
                return false;
            }
        }

        return magicSquare;
    }

}
