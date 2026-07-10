package atividades.atividade1;

import java.util.Scanner;



public class SistemaDeVotacao {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");

        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar!");

        } else if (idade > 17 && idade <= 70) {
            System.out.println("Voto obrigatório!");

        } else {
            System.out.println("Voto facultativo!");
        }

        entrada.close();
    }
}
