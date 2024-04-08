package Parte2.NonStaticEx;

public class Main {

    public static void main(String[] args) {

        // É preciso primeiro criar uma instância da classe (um objeto)
        // para então acessar seus atributos e chamar seus métodos

        NonStaticEx objeto = new NonStaticEx();

        System.out.println(objeto.numero);

        objeto.print();

    }

}
