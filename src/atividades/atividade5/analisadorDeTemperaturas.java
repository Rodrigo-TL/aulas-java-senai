package atividades.atividade5;

import java.util.Scanner;

import java.util.Arrays;

public class analisadorDeTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] temperaturas = new double[6];

        System.out.println("Introduza 6 temperaturas consecutivas:");


        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }


        double maior = temperaturas[0];
        double menor = temperaturas[0];


        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }


        System.out.println("\nTemperaturas: " + Arrays.toString(temperaturas));
        System.out.println("Maior temperatura: " + maior + "ºC");
        System.out.println("Menor temperatura: " + menor + "ºC");

        scanner.close();
    }
}
