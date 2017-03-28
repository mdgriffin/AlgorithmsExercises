package mdgriffin.me.lab6;

public class ClassDetails {

    private String name;
    private String roomNumber;

    public ClassDetails(String name, String roomNumber) {
        setName(name);
        setRoomNumber(roomNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String toString () {
        return getName();
    }
}
