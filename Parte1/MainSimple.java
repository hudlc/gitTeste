package Parte1;

public class MainSimple {

    public static void main(String[] args) {
        SimpleRoom kitchen = new SimpleRoom("This is a kitchen");
        SimpleRoom bathroom = new SimpleRoom("This is a bathroom");

        kitchen.setNextRoom(bathroom);

        Player player1 = new Player(kitchen);

        player1.look();
        player1.goToNextRoom();
        player1.look();
        player1.goToNextRoom();
        player1.look();

    }

}
