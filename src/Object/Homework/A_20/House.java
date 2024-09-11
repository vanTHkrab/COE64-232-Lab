package Object.Homework.A_20;

import java.util.ArrayList;

public class House {
    private final ArrayList<Room> rooms;

    public House(ArrayList<Room> rooms) {  // Blank 8: House
        this.rooms = rooms;
    }

    public ArrayList<Room> getTotalRoomsInHouse() {
        return rooms;
    }
}
