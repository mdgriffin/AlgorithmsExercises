package mdgriffin.me.lab6;

public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9 ; // 9 hours per day

    private ClassDetails[][] grid;

    public TimeTable(){

        grid = new ClassDetails[DAYS][HOURS];
        // the grid will have null values

    }

    public void set(int day, int hour, ClassDetails details) {
        // store details at the specified position in the grid
        grid[day][hour] = details;
    }

    public void display() {
        String table = String.format(
                "%-10s%-22s%-22s%-22s%-20s%-22s",
                "Time",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday"
        );

        for (int j = 0; j < HOURS; j++) {
            table += String.format("\n%-10s", (j + 9) + ":00");
            for (int i = 0; i < DAYS; i++) {
                if (get(i, j) == null) {
                    table += String.format("%-22s", "----------");
                } else {
                    table += String.format("%-22s", get(i, j));
                }

            }
        }

        System.out.println(table);


    }

    public ClassDetails get(int day, int hour) {
        // returns the object at the specified position in the grid
        return grid[day][hour];
    }

    public int getNumberOfClassesFor(String name) { //e.g. get number of Algorithms classes
        int numClasses = 0;

        for (int i = 0; i < DAYS; i++) {
            for (int j = 0; j < HOURS; j++) {
                if (grid[i][j].getName().equals(name)) {
                    numClasses++;
                }
            }
        }

        return numClasses;
    }

    public int getNumberOfFreeSlots() {
        int numSlots =  0;

        for (int i = 0; i < DAYS; i++) {
            for (int j = 0; j < HOURS; j++) {
                if (grid[i][j] == null) {
                    numSlots++;
                }
            }
        }

        return numSlots;
    }
}
