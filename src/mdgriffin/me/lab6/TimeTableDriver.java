package mdgriffin.me.lab6;

/**
 * Created by mdgri on 28/03/2017.
 */
public class TimeTableDriver {
    public static void main(String[] args) {
        TimeTable myTimeTable = new TimeTable();

        myTimeTable.set(0, 0, new ClassDetails("Algorithms", "T107"));
        myTimeTable.set(0, 2, new ClassDetails("OOP3", "R302"));
        myTimeTable.set(1, 0, new ClassDetails("Networking", "T206"));
        myTimeTable.set(2, 0, new ClassDetails("Scripting", "T107"));
        myTimeTable.set(3, 0, new ClassDetails("Algorithms", "S302"));
        myTimeTable.set(4, 0, new ClassDetails("Software Engineering", "T117"));
        myTimeTable.set(1, 1, new ClassDetails("OOP3", "R302"));

        myTimeTable.display();
    }
}
