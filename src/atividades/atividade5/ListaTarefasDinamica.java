package atividades.atividade5;

import java.util.ArrayList;

import java.util.Scanner;

public class ListaTarefasDinamica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> listaTarefasDinamica = new ArrayList<>();

        System.out.println("Introduza as suas tarefas (na última tarefa digite 'fim' para terminar):");


        while (true) {
            System.out.print("Tarefa: ");
            String entrada = scanner.nextLine().trim();


            if (entrada.equalsIgnoreCase("fim")) {
                break; // Interrompe o laço imediatamente
            }

            if (!entrada.isEmpty()) {
                listaTarefasDinamica.add(entrada);
            }
        }


        System.out.println("\nTotal de tarefas registadas: " + listaTarefasDinamica.size());

        for (int i = 0; i < listaTarefasDinamica.size(); i++) {
            System.out.println((i + 1) + ". " + listaTarefasDinamica.get(i));
        }

        scanner.close();
    }
}
