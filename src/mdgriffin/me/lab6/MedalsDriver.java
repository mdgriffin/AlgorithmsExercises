package mdgriffin.me.lab6;


public class MedalsDriver {
    public static void main(String[] args) {
        Medals medals;
        int[][] testCounts = {
                { 1, 0, 1 },
                { 1, 1, 0 },
                { 0, 0, 1 },
                { 1, 0, 0 },
                { 0, 1, 1 },
                { 0, 1, 1 },
                { 1, 1, 0 }
        };

        medals = new Medals();

        for (int row = 0; row < testCounts.length; row++) {
            for (int col = 0; col < testCounts[0].length; col++) {
                medals.set(row, col, testCounts[row][col]);
            }
        }

        medals.display();
    }
}
