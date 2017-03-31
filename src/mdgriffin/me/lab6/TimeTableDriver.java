package mdgriffin.me.lab6;

public class TimeTableDriver {
    public static void main(String[] args) {
        TimeTable myTimeTable = new TimeTable();

        // Classes on Monday
        myTimeTable.set(0, 0, new ClassDetails("Algorithms", "T107"));
        myTimeTable.set(0, 2, new ClassDetails("OOP3", "R302"));
        myTimeTable.set(0, 7, new ClassDetails("Scripting", "S306"));

        // Classes on Tuesday
        myTimeTable.set(1, 0, new ClassDetails("Networking", "T206"));
        myTimeTable.set(1, 1, new ClassDetails("OOP3", "R302"));

        // Classes on Wednesday
        myTimeTable.set(2, 0, new ClassDetails("Scripting", "T107"));
        myTimeTable.set(2, 4, new ClassDetails("Software Engineering", "T206"));

        // Classes on Thursday
        myTimeTable.set(3, 0, new ClassDetails("Algorithms", "S302"));

        // Classes on Friday
        myTimeTable.set(4, 0, new ClassDetails("Software Engineering", "T117"));
        myTimeTable.set(4, 8, new ClassDetails("OOP3", "R204"));

        myTimeTable.display();
    }
}
