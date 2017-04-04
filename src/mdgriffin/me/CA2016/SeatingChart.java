package mdgriffin.me.CA2016;

public class SeatingChart {

    private int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
            {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 40, 40, 40, 40, 40, 50, 40, 30}};

    private final int noOfRows = seats.length;
    private final int noOfCols = seats[0].length;

    public int getNoOfRows() {
        return noOfRows;
    }

    public int getNoOfCols() {
        return noOfCols;
    }

    // Outputs the price of seats in a grid like pattern.
    public void printSeats() {
        //To be completed
        String chart = "";

        for(int i=0; i < noOfRows; i++ )
        {
            for(int j=0; j< noOfCols; j++)
            {
                chart += String.format("%-6s", seats[i][j]);
            }
            chart = chart + "\n";
        }
        System.out.println(chart);
    }



    // Sell seat by price - find the first seat with that price and
    // set the price to 0 to indicate it has been sold
    // return the row and seat number
    // or null if no seat with that price is available
    public RowAndColumn sellSeatByPrice(int price) {

        for(int i=0; i< noOfRows; i++)
        {
            for(int j=0; j<noOfCols; j++)
            {
                if(seats[i][j] == price)
                {
                    seats[i][j] = 0;
                    return new RowAndColumn(i,j);
                }
            }
        }

        return null;
    }

    // check if the seat specified by row and col is available
    public boolean isEmpty(int row, int col) {

        if(seats[row][col]==0) {
            return false;
        } else {
            return true;
        }
    }

    // Sell seat given its row and col
    // Set the price to 0 to indicate it has been sold
    public void sellSeatByNumber(int row, int col) {
        seats[row][col] = 0;
    }
}
