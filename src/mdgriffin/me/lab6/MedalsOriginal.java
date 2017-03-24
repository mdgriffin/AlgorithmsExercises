package mdgriffin.me.lab6;

/**
 * Created by t00119683 on 24/03/2017.
 */
public class MedalsOriginal {
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
}
