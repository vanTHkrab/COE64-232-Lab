package Object.Homework.A_20;

import java.util.ArrayList;

public class HouseDemo {
    public static void main(String[] args) {
        Room[] room = new Room[3];                          // Blank 9: Room[]
        room[0] = new Room("Dining Room", 2);
        room[1] = new Room("Bed Room", 1);
        room[2] = new Room("Living Room", 3);               // Blank 11: room[2]

        // Create ArrayList of Room and add Room
        ArrayList<Room> book = new ArrayList<Room>();       // Blank 12: new
        for (int i = 0; i < room.length; i++)               // Blank 13: room.length
            book.add(room[i]);                             // Blank 14: book; Blank 15: room[i]

        House house = new House(book);                      // Blank 16: book

        ArrayList<Room> rooms = house.getTotalRoomsInHouse();

        for (Room r: rooms) {
            System.out.println("The Room Number of " + r.getRoomName() + " is: " + r.getRoomNo()); // Blank 19: r.getRoomName(); Blank 20: r.getRoomNo()
        }
    }
}
