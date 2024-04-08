package Parte1;

public class Escopo {

    public static String checkString() {

        String output = "a thing!!! ";

        return output;
    }

    public static void main(String[] args) {

        String output = "something!!!";

        System.out.println(output);
        System.out.println(checkString());

    }

}
