package atividades.atividade5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Classe auxiliar para gerenciar as propriedades de cada tarefa
class Tarefa {
    private String nome;
    private LocalDate dataValidade;
    private int ordemCriacao;

    public Tarefa(String nome, LocalDate dataValidade, int ordemCriacao) {
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.ordemCriacao = ordemCriacao;
    }

    public String getNome() { return nome; }
    public LocalDate getDataValidade() { return dataValidade; }
    public int getOrdemCriacao() { return ordemCriacao; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return nome + " (Vence em: " + dataValidade.format(formatter) + ")";
    }
}

public class ListaTarefasDinamica {

    // Listas globais para controle das tarefas ativas e concluídas
    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();
    private static ArrayList<Tarefa> listaConcluidas = new ArrayList<>();
    private static int contadorOrdem = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Tarefas ---");
        System.out.println("Introduza as suas tarefas (digite 'fim' no nome para terminar):");

        while (true) {
            System.out.print("\nNome da Tarefa: ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            if (!nome.isEmpty()) {
                LocalDate validade = lerData(scanner);
                contadorOrdem++;
                listaTarefas.add(new Tarefa(nome, validade, contadorOrdem));
            }
        }

        // Menu de operações solicitadas
        int opcao = 0;
        do {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("1. Listar tarefas na ordem atual");
            System.out.println("2. Ordenar tarefas em ordem alfabética");
            System.out.println("3. Remover tarefa específica por nome");
            System.out.println("4. Remover tarefa por FIFO (Primeira que entrou)");
            System.out.println("5. Remover tarefa por LIFO (Última que entrou)");
            System.out.println("6. Remover tarefa por FEFO (Primeira que vence)");
            System.out.println("7. Visualizar tarefas concluídas");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
                processarOpcao(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
            }
        } while (opcao != 8);

        scanner.close();
    }

    // Processa a escolha do usuário no menu
    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                exibirLista(listaTarefas, "Tarefas Ativas");
                break;
            case 2:
                ordenarAlfabeticamente();
                exibirLista(listaTarefas, "Tarefas Ordenadas Alfabeticamente");
                break;
            case 3:
                removerEspecifica();
                break;
            case 4:
                removerFIFO();
                break;
            case 5:
                removerLIFO();
                break;
            case 6:
                removerFEFO();
                break;
            case 7:
                exibirLista(listaConcluidas, "Tarefas Concluídas");
                break;
            case 8:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // Ordenação Alfabética utilizando Comparator
    private static void ordenarAlfabeticamente() {
        Collections.sort(listaTarefas, new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa t1, Tarefa t2) {
                return t1.getNome().compareToIgnoreCase(t2.getNome());
            }
        });
    }

    // Remoção de uma tarefa específica digitada pelo usuário
    private static void removerEspecifica() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome exato da tarefa que deseja remover: ");
        String nomeAlvo = sc.nextLine().trim();

        Tarefa encontrada = null;
        for (Tarefa t : listaTarefas) {
            if (t.getNome().equalsIgnoreCase(nomeAlvo)) {
                encontrada = t;
                break;
            }
        }

        if (encontrada != null) {
            listaTarefas.remove(encontrada);
            listaConcluidas.add(encontrada); // Registro de conclusão
            System.out.println("Tarefa '" + encontrada.getNome() + "' concluída e removida!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    // FIFO: First In, First Out (A mais antiga inserida sai primeiro)
    private static void removerFIFO() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
            return;
        }
        // Ordena pela ordem de criação mais baixa
        Tarefa fifo = Collections.min(listaTarefas, Comparator.comparingInt(Tarefa::getOrdemCriacao));
        listaTarefas.remove(fifo);
        listaConcluidas.add(fifo);
        System.out.println("Removida por FIFO: " + fifo.getNome());
    }

    // LIFO: Last In, First Out (A mais recente inserida sai primeiro)
    private static void removerLIFO() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
            return;
        }
        // Ordena pela ordem de criação mais alta
        Tarefa lifo = Collections.max(listaTarefas, Comparator.comparingInt(Tarefa::getOrdemCriacao));
        listaTarefas.remove(lifo);
        listaConcluidas.add(lifo);
        System.out.println("Removida por LIFO: " + lifo.getNome());
    }

    // FEFO: First Expired, First Out (A data de vencimento mais próxima sai primeiro)
    private static void removerFEFO() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
            return;
        }
        // Ordena pela menor data de validade
        Tarefa fefo = Collections.min(listaTarefas, Comparator.comparing(Tarefa::getDataValidade));
        listaTarefas.remove(fefo);
        listaConcluidas.add(fefo);
        System.out.println("Removida por FEFO (Menor Validade): " + fefo.getNome());
    }

    // Auxiliar para ler e validar datas informadas pelo usuário
    private static LocalDate lerData(Scanner scanner) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print("Data de validade (dd/mm/aaaa): ");
            String dataStr = scanner.nextLine().trim();
            try {
                return LocalDate.parse(dataStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Use o padrão dd/MM/yyyy (Exemplo: 25/12/2026).");
            }
        }
    }

    // Exibe o estado atual das listas
    private static void exibirLista(ArrayList<Tarefa> lista, String titulo) {
        System.out.println("\n--- " + titulo + " (Total: " + lista.size() + ") ---");
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }
}
