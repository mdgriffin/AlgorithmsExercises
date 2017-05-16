package mdgriffin.me.ExamAut2016;

public class Matrix {
    private int rows;
    private int columns;
    private double [][] grid;

    public Matrix(int r, int c){
        rows = r;
        columns = c;
        grid = new double[rows][columns];
        for (int row = 0; row < rows; row++)
            for (int col = 0; col < columns; col++)
                grid[row][col] = 0.0;
    }

    public void set(int r, int c, double d){
        grid[r][c] = d;
    }

    public double get(int r, int c){
        return grid[r][c];
    }

    public void fill(double d){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = d;
            }
        }
    }

    public void display() {
        String result = "";

        for (int i = 0; i < rows; i++) {
            String rowResult = "\n";

            for (int j = 0; j < columns; j++) {
                if (j == 0) {
                    rowResult += String.format("%.2f", grid[i][j]);
                } else {
                    rowResult += String.format("%8.2f", grid[i][j]);
                }

            }

            result += rowResult;
        }

        System.out.println(result);
    }

    public Matrix subtract(Matrix m){
        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.set(i, j, this.get(i, j) - m.get(i, j));
            }
        }

        return resultMatrix;
    }
}