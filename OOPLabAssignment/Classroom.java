package OOPLabAssignment;

public class Classroom {
    private int roomNo;
    private int capacity;

    //Constructor
    public Classroom(int roomNo, int capacity){
        this.roomNo = roomNo;
        this.capacity = capacity;
    }

    //Getters
    public int getRoomNo(){
        return roomNo;
    }
    public int getCapacity(){
        return capacity;
    }

    //Setters
    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    //To view classroom info
    public void viewClassroomInfo(){
        System.out.println("Room No: " + roomNo + " | Capacity: " + capacity);
    }
}
