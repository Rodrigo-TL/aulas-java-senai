package atividades.atividade2;

import java.util.Scanner;

public class SistemaFaturacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        double desconto = 0;


        if (valorCompra < 100.00) {
            desconto = 0;

        } else if (valorCompra >= 100.00 && valorCompra <= 299.99) {
            desconto = valorCompra * 0.10;
        } else {
            desconto = valorCompra * 0.20;
        }


        double totalPagar = valorCompra - desconto;


        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Valor poupado: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalPagar);

        entrada.close();
    }
}
