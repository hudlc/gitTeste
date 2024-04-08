public class MainComplex {

    public static void main(String[] args) {
        ComplexRoom kitchen = new ComplexRoom("This is a kitchen");
        ComplexRoom bathroom = new ComplexRoom("This is a bathroom");
        ComplexRoom bedroom = new ComplexRoom("This is a bedroom");

        kitchen.addAdjacentRoom("south", bedroom);
        bedroom.addAdjacentRoom("north", kitchen);

        kitchen.addAdjacentRoom("east", bathroom);
        bedroom.addAdjacentRoom("west", bedroom);

        ComplexPlayer player1 = new ComplexPlayer(kitchen);

        player1.look();

        player1.goToRoom("south");

        player1.look();

    }

}
