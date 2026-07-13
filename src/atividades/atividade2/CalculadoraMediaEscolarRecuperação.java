package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraMediaEscolarRecuperação {

    public static void main (String[] args) {
        Scanner entrada = new Scanner ( System.in );

           System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();


                double media = (nota1 + nota2 + nota3) / 3;


        System.out.printf("Média Calculada: %.2f\n", media);


        if (media >= 7.0) {
            System.out.println("Aprovado!");

        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Em Recuperação.");

        } else {
            System.out.println("Reprovado.");
        }

        entrada.close();
    }
}
