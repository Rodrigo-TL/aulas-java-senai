package atividades.atividade4;

public class sistemaCorrigido {

    public static void main(String[] args) {

        int valor1 = 10;
        // O erro foi a inversão da variável 1valor
        // mudei para valor1

        int contador = 5;
        //Faltou o ";" no final da linha
        //Inclui o ";"

        exibirMensagens("Bem-vindo ao sistema!", 1);
        //O método estava somente com o texto
        //Inseri o número 1, que é quantas vezes o texto vai repetir

        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);

            contador--;
            //O código estava em loop infinito
            //Inseri o "contador--" para quando chegar até zero e parar
        }
    }

    public static void exibirMensagens(String texto, int repeticoes) {
        //O método estava com as chaves erradas e faltava a palavra static
        //Coloquei as chaves e coloquei a palavra static para que o main usasse ele

        for (int i = 0; i < repeticoes; i++) {

            System.out.println(texto);
        }
    }
}
