package Parte1;

public class Ifs {

    public static int choice(int a, int b) {

        int maior = a;

        if (b >= a) {
            maior = b;
        }

        return maior;
    }

    public static void main(String[] args) {
        System.out.println(choice(4, 3));

    }
}
