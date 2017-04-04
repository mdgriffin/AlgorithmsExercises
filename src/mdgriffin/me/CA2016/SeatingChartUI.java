package mdgriffin.me.CA2016;

import java.util.Scanner;

public class SeatingChartUI {

    public static void main(String[] args) {

        SeatingChart chart = new SeatingChart();
        chart.printSeats();
        final int noOfRows = chart.getNoOfRows();
        final int noOfCols = chart.getNoOfCols();

        System.out.println("Pick by <s>eat or <p>rice or <q> to quit: ");
        Scanner in = new Scanner(System.in);
        String choice = in.next();

        while (!choice.equals("q")) {

            if (choice.equals("s")) {
                System.out.println("Enter the row you want: ");
                int row = in.nextInt();
                if (row >= 0 && row < noOfRows) {
                    //Seat number equates to col
                    System.out.println("Enter the seat number you want: ");
                    int col = in.nextInt();
                    if (col >= 0 && col < noOfCols) {
                        if (chart.isEmpty(row, col)) {
                            chart.sellSeatByNumber(row, col);
                        } else {
                            System.out.println("This seat is already booked");
                        }
                    }
                }
            } else if (choice.equals("p")) {
                // pick by price
                System.out.println("What price do you want to buy?");
                int price = in.nextInt();
                RowAndColumn rowAndColumn = chart.sellSeatByPrice(price);
                if (rowAndColumn != null) {
                    int row = rowAndColumn.getRow();
                    int col = rowAndColumn.getColumn();
                    System.out.println("Seat at row " + row + ", seat number " + col + "has been booked for you");
                } else {
                    System.out.println("No seats available at this price");
                }
            }
            chart.printSeats();
            System.out.println("Pick by <s>eat or <p>rice or <q> to quit: ");
            choice = in.next();
        }
    }
}