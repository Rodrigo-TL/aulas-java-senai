package atividades.atividade5;

import java.util.Scanner;

import java.util.Arrays;

    public class SomaElementosVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Por favor, introduza 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("\nVetor preenchido: " + Arrays.toString(numeros));
        System.out.println("A soma de todos os elementos é: " + soma);

        scanner.close();
    }
}
