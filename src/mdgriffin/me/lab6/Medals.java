package mdgriffin.me.lab6;


public class Medals {

    private final int COUNTRIES = 7;
    private final int MEDALS = 3;
    private String[] countries =
    {
        "Canada",
        "China",
        "Germany",
        "Korea",
        "Japan",
        "Russia",
        "United States"
    };

    private int[][] counts;

    public Medals(){
        counts = new int[COUNTRIES][MEDALS];
    }

    public void set(int country, int medal, int count) {
        // store count at the specified position in the grid
        counts[country][medal] = count;
    }

    public void display() {
        String table = "";

        table += "        Country    Gold  Silver  Bronze   Total";

        for (int row = 0; row < COUNTRIES; row++) {
            table += "\n"  + String.format("%15s", countries[row]);

            for (int col = 0; col < MEDALS; col++) {
                table += String.format("%8d", counts[row][col]);
            }
            table += String.format("%8d", calculateRowTotals(row));
        }

        table += "\n\nTotal medals "+ sum();

        table += String.format("\n\n        Country    Total Medals\n");

        for (int i = 0; i < COUNTRIES; i++){
            table += String.format("%15s", countries[i]);
            table += String.format("%8d\n", calculateRowTotals(i));
        }

        table += String.format("\n\n    Gold  Silver  Bronze\n");
        for (int j = 0; j < MEDALS; j++){
            table += String.format("%8d", calculateColumnTotals(j));
        }

        System.out.println(table);
    }

    public int sum(){
        int sum = 0;

        //compute total medals for all countries and all medal types
        for (int row = 0; row < COUNTRIES; row++) {
            for (int col = 0; col < MEDALS; col++) {
                sum += counts[row][col];
            }
        }

        return sum;
    }

    public int[] calculateRowTotals(){
        int[] rowCount = new int[COUNTRIES];

        for (int row = 0; row < COUNTRIES; row++) {
            rowCount[row] += calculateRowTotals(row);
        }

        return rowCount;
    }

    public int calculateRowTotals(int row){
        int rowCount = 0;

        for (int col = 0; col < MEDALS; col++) {
            rowCount+= counts[row][col];
        }

        return rowCount;
    }

    public int[] calculateColumnTotals() {
        int[] colCount = new int[MEDALS];

        //compute column totals i.e. total number of medals for each medal type
        for (int col = 0; col < MEDALS; col++) {
            colCount[col] += calculateColumnTotals(col);
        }

        return colCount;
    }

    public int calculateColumnTotals(int col) {
        int colCount = 0;

        //compute column totals i.e. total number of medals for each medal type
        for (int row = 0; row < COUNTRIES; row++) {
            colCount += counts[row][col];
        }

        return colCount;
    }

    public int[][] getCounts () {
        return counts;
    }

}
