package Object.Homework.A_20;

public class Room {
    String roomName;
    int roomNo;

    public Room(String name, int number) { // Blank 1: Room
        this.roomName = name;              // Blank 2: this.roomName
        this.roomNo = number;              // Blank 3: this.roomNo
    }

    public String getRoomName(){
        return this.roomName;                // Blank 4: this.roomName
    }

    public int getRoomNo(){
        return this.roomNo;                  // Blank 5: this.roomNo
    }
}