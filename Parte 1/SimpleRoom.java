public class SimpleRoom {
    private String description;
    private SimpleRoom nextRoom;

    public SimpleRoom(String description) {
        this.description = description;
    }

    public void setNextRoom(SimpleRoom room) {
        this.nextRoom = room;
    }

    public SimpleRoom getNextRoom() {
        return this.nextRoom;
    }

    public String getDescription() {
        return this.description;
    }

}
