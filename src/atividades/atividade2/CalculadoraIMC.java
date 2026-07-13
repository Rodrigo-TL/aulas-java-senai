package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite o seu peso: ");
        double peso = teclado.nextDouble();



        System.out.print("Digite a sua altura: ");
        double altura = teclado.nextDouble();


        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);


        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal.");

        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }


        teclado.close();
    }
}