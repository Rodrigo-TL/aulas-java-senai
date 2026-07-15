package Aulas;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Qual sua altura? ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Qual seu cargo? ");
        String cargo = scanner.nextLine();

        System.out.print("Qual o período que estuda no SENAI? ");
        String periodoSenai = scanner.nextLine();


        System.out.println(
                "\n=== FORMULÁRIO DE REGISTRO ===\n" +
                        "Nome Completo: " + nomeCompleto + "\n" +
                        "Idade: " + idade + " anos\n" +
                        "Altura: " + altura + "m\n" +
                        "Cargo: " + cargo + "\n" +
                        "Período no SENAI: " + periodoSenai
        );

        scanner.close();
    }
}















//crie um formulário com a classe Scanner que registre seu: nome completo, idade, altura, cargo, período que estuda no SENAI,

// Esse formulário deve imprimir todos os itens, depois de registrados, dentro de um System.out.println apenas.

//OBS: Quero que apareça assim no terminal: Ex: Qual seu nome?


