package Parte1;

public class ComplexPlayer {
    private ComplexRoom currentRoom;

    public ComplexPlayer(ComplexRoom room) {
        this.currentRoom = room;
    }

    public void goToRoom(String direction) {
        ComplexRoom newRoom = currentRoom.getAdjacentRoom(direction);

        if (newRoom == null) {
            System.out.println("You can't go that direction");
        }

        else {
            this.currentRoom = newRoom;
            System.out.println("You enter that room");
        }

    }

    public void look() {
        System.out.println(this.currentRoom.getDescription());
    }

}
