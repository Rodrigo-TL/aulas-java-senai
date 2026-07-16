package atividades.atividade5;

import java.util.ArrayList;

import java.util.Scanner;

public class FiltroDeNotasAcademicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Introduza as notas (digite um valor negativo para terminar):");


        while (true) {
            System.out.print("Nota: ");
            double notaInput = scanner.nextDouble();

            if (notaInput < 0) {
                break; // Para a leitura se for negativo
            }

            notas.add(notaInput);
        }


        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi registada.");
            scanner.close();
            return;
        }


        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();


        System.out.printf("\nMédia das notas: %.2f%n", media);


        for (int i = notas.size() - 1; i >= 0; i--) {
            if (notas.get(i) < 5.0) {
                notas.remove(i);
            }
        }


        System.out.println("Notas aprovadas (>= 5.0): " + notas);

        scanner.close();
    }
}
