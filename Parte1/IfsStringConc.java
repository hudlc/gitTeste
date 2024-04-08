package Parte1;

public class IfsStringConc {
    public static void main(String[] args) {
        String input = "pegar";
        String output = "";

        if (input.contains("get")) {

        } else if (input.contains("pegar")) {
            output = output + "Voce pegou\n";
        }
        if (output.isEmpty()) {
            output = "Não entendi";
        }

        System.out.println(output);
    }
}
