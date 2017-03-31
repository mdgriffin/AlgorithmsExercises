package mdgriffin.me.lab6;

public class TicTacToe
{
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;

    /**
     Constructs an empty board.
     */
    public TicTacToe()
    {
        board = new String[ROWS][COLUMNS];
        // Fill with spaces
        for (int i = 0; i < ROWS; i++)
        for (int j = 0; j < COLUMNS; j++)
            board[i][j] = " ";
    }

    /**
     Sets a field in the board. The field must be unoccupied.
     @param i the row index
     @param j the column index
     @param player the player ("x" or "o")
     */
    public void set(int i, int j, String player)
    {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    /**
     Creates a string representation of the board, such as
     |x  o|
     |  x |
     |   o|
     @return the string representation
     */
    public String toString()
    {
        String r = "";
        for (int i = 0; i < ROWS; i++)
        {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)
                r = r + board[i][j];
            r = r + "|\n";
        }
        return r;
    }

    public String getWinner () {
        // loop over the board
        // check if any of the rows, columns or diagonals contain the same 'o' or 'x' character
        String winner = " ";

        for (int row = 0; row < ROWS; row++)
        {
            int numOInRow = 0;
            int numXInRow = 0;
            int numOInCol = 0;
            int numXInCol = 0;

            for (int col = 0; col < COLUMNS; col++)
            {
                if (board[row][col].equals("o")) {
                    numOInRow++;
                } else if (board[row][col].equals("x")) {
                    numXInRow++;
                }

                if (board[col][row].equals("o")) {
                    numOInCol++;
                } else if (board[col][row].equals("x")) {
                    numXInCol++;
                }
            }

            if (numOInRow == ROWS || numOInCol == COLUMNS)
            {
                winner = "o";
                break;
            } else if (numXInRow == ROWS || numXInCol == COLUMNS)
            {
                winner = "x";
                break;
            }
        }

        return winner;
    }
}