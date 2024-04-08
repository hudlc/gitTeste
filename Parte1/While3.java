package Parte1;

import java.util.Scanner; // Import the Scanner class

public class While3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputText;

        while (true) {

            System.out.println();
            inputText = input.nextLine();
            System.out.println("You typed: " + inputText);

            if (inputText.equals("sair")) {
                input.close();
                break;
            }
        }
    }

}
