package Aulas.exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefasDinamicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true){
            System.out.print("Digite uma tarefa: ");
            tarefas.add(entrada.nextLine());

            System.out.println("Deseja continuar?");
            String opcao = entrada.nextLine();

            if (opcao.equals("fim")){
                break;
            }
        }
        System.out.println("Total de tarefas registradas: "+tarefas.size());

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i+1)+". "+tarefas.get(i));
        }
    }
}