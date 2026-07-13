package atividades.atividade2;

import java.util.Scanner;

public class OdetetiveDeNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Detetive, digite o número para investigação: ");
        int numero = scanner.nextInt();


        if (numero % 2 == 0) {
            System.out.println("O número é Par.");
        } else {
            System.out.println("O número é Ímpar.");
        }


        if (numero > 0) {
            System.out.println("O número é Positivo.");
        } else if (numero < 0) {
            System.out.println("O número é Negativo.");
        } else {
            System.out.println("O número é Zero.");
        }

        scanner.close();
    }
}