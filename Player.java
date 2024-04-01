public class Player {
    SimpleRoom currentRoom;

    public Player(SimpleRoom currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void look() {
        System.out.println(currentRoom.getDescription());
    }

    public void changeRoom(SimpleRoom newRoom) {
        this.currentRoom = newRoom;
    }

    public void goToNextRoom() {
        if (currentRoom.getNextRoom() != null) {
            this.currentRoom = currentRoom.getNextRoom();
        }
    }

}
