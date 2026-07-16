package Aulas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class QuintaAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declarado vetores
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        String[] nomes = new String[]{
                "João", "Ithalo", "Daniel"
        };

        //foreach
        for (int numero : numeros) {
            System.out.println(numero);
        }

        //Declarando arraylist
        ArrayList<String> listaDeNomes = new ArrayList<>();

        int opcao = 0;
        while (opcao == 0) {
            int opcaoLista;
            System.out.println("Escolha uma opção:");
            System.out.println("Adicionar = 1\nApagar = 2");
            opcaoLista = entrada.nextInt();
            entrada.nextLine();
            if (opcaoLista == 1) {
                System.out.println("Digite um nome ADICIONAR: ");
                //Adiciona algum valor na primeira posição
                //Se ja tiver um valor na primeira, ele insere na segunda posição
                listaDeNomes.add(entrada.nextLine());
            } else {
                System.out.println("Digite um nome APAGAR: ");
                //Retira o nome que ta na primeira posição
                listaDeNomes.remove(10);
            }

            System.out.println("Continuar - 0");
            System.out.println("Sair - 1");

            opcao = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println(listaDeNomes);
    }
}