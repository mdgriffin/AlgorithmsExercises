package mdgriffin.me.lab6;


public class Medals {
    /*
    public static void main(String[] args)
    {
        final int COUNTRIES = 7;
        final int MEDALS = 3;

        String[] countries =
                {
                        "Canada",
                        "China",
                        "Germany",
                        "Korea",
                        "Japan",
                        "Ireland",
                        "United States"
                };

        int[][] counts =
                {
                        { 1, 0, 1 },
                        { 1, 1, 0 },
                        { 0, 0, 1 },
                        { 1, 0, 0 },
                        { 0, 1, 1 },
                        { 0, 1, 1 },
                        { 1, 1, 0 }
                };

        System.out.println("        Country    Gold  Silver  Bronze   Total");

        // Print countries, counts, and row totals
        for (int i = 0; i < COUNTRIES; i++)
        {
            // Process the ith row
            System.out.printf("%15s", countries[i]);

            int total = 0;

            // Print each row element and update the row total
            for (int j = 0; j < MEDALS; j++)
            {
                System.out.printf("%8d", counts[i][j]);
                total = total + counts[i][j];
            }

            // Display the row total and print a new lineg
            System.out.printf("%8d\n", total);
        }

        //Total all the medals
        int totalMedals = 0;
        for (int i = 0; i < COUNTRIES; i++) {
            for (int j = 0; j < MEDALS; j++) {
                totalMedals += counts[i][j];
            }
        }
        System.out.println("\n\nTotal medals "+ totalMedals);



        //Saving row Totals
        int []countryTotals = new int[COUNTRIES];
        for (int i = 0; i < COUNTRIES; i++)
        {
            // Total the ith row
            countryTotals[i] = 0;

            for (int j = 0; j < MEDALS; j++)
            {
                countryTotals[i] += counts[i][j];
            }
        }

        //Display the row totals
        System.out.println("\n\n        Country    Total Medals");
        for (int i = 0; i < COUNTRIES; i++){
            System.out.printf("%15s", countries[i]);
            System.out.printf("%8d\n", countryTotals[i]);
        }

        //Saving column Totals
        int []medalTotals = new int[MEDALS];
        for (int j = 0; j < MEDALS; j++)
        {
            // Total the jth column
            medalTotals[j] = 0;

            for (int i = 0; i < COUNTRIES; i++)
            {
                medalTotals[j] += counts[i][j];
            }
        }

        //Display the column totals
        System.out.println("\n\n    Gold  Silver  Bronze");
        for (int j = 0; j < MEDALS; j++){
            System.out.printf("%8d", medalTotals[j]);
        }
    }
    */

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
        //display the grid
        String table = "";

        for (int row = 0; row < COUNTRIES; row++) {
            for (int col = 0; col < MEDALS; col++) {
                table += String.format("%-5d", counts[row][col]);
            }

            table += "\n";
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

        //compute row totals i.e. total number of medals for each country
        for (int row = 0; row < COUNTRIES; row++) {
            for (int col = 0; col < MEDALS; col++) {
                    rowCount[row] += counts[row][col];
            }
        }

        return rowCount;
    }

    public int[] calculateColumnTotals() {
        int[] colCount = new int[MEDALS];

        //compute column totals i.e. total number of medals for each medal type
        for (int row = 0; row < COUNTRIES; row++) {
            for (int col = 0; col < MEDALS; col++) {
                colCount[col] += counts[row][col];
            }
        }

        return colCount;
    }

    public int[][] getCounts () {
        return counts;
    }

}
