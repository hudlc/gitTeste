import java.util.Scanner; // Import the Scanner class

public class While {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputText;

        while (true) {
            System.out.println();
            inputText = input.nextLine();
            System.out.println("You typed: " + inputText);
        }
    }

}
