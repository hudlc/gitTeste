package Parte1;

import java.util.HashMap;

public class ComplexRoom {
    private String description;
    private HashMap<String, ComplexRoom> adjacentRooms;

    public ComplexRoom(String description) {
        this.description = description;
        this.adjacentRooms = new HashMap<String, ComplexRoom>();
    }

    public String getDescription() {
        return this.description;
    }

    public void addAdjacentRoom(String direction, ComplexRoom room) {
        this.adjacentRooms.put(direction, room);

    }

    public ComplexRoom getAdjacentRoom(String direction) {
        return this.adjacentRooms.get(direction);
    }

}
