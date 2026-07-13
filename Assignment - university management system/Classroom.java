public class Classroom {
    private int id;
    private String roomNumber;
    private int capacity;

    public Classroom(int id, String roomNumber, int capacity) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }


    public String classroomInfo() {
        return "Classroom ID: " + id + " | Room: " + roomNumber + " | Capacity: " + capacity;
    }
}