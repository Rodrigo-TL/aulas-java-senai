package atividades.atividade3;

import java.util.Scanner;

public class SaudacaoPersonalizada {


    public static void imprimirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! Seja Bem-vindo à nossa aula de métodos.");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o seu nome: ");
        String nomeUtilizador = entrada.nextLine();


        imprimirSaudacao(nomeUtilizador);

        entrada.close();
    }
}
