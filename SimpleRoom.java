public class SimpleRoom {
    private String description;
    private SimpleRoom nextRoom;

    public SimpleRoom(String desscription) {
        this.description = desscription;
    }

    public void setNetxtRoom(SimpleRoom room) {
        this.nextRoom = room;
    }

    public SimpleRoom getNextRoom() {
        return this.nextRoom;
    }

    public String getDescription() {
        return this.description;
    }

}
