package Aulas;

import java.util.Scanner;

public class segundaAula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int valor = entrada.nextInt();

        if (valor < 10) {
            System.out.println("Menor do que 10");

        } else if (valor > 10) {
            System.out.println("Maior do que 10");

        } else {
            System.out.println("O número é igual a 10");
        }

        switch (valor) {
            case 1:
                System.out.println("Escolheu 1");
                break; // Para o switch aqui se for 1

            case 2:
                System.out.println("Escolheu 2");
                break; // Para o switch aqui se for 2

            default:
                System.out.println("Escolheu outro número");
                break;
        }
        entrada.close();
    }
}