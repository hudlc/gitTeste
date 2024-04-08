package Parte1;

public class Select {

    public static String pegaResposta(String input) {

        String output = "Não entendi";

        if (input.contains("andar")) {
            output = output + "Você andou";
        }

        if (input.contains("pegar")) {
            output = output + "Você pegou o item";
        }

        if (input.contains("olhar")) {
            output = output + "Você olha ao redor";
        }

        return output;

    }

    public static void main(String[] args) {

        String resposta = pegaResposta("andar pegar");

        System.out.println(resposta);
    }

}
