package Aulas.exemplos;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploFefo {
    public static void main(String[] args) {
        ArrayList<String> estoque = new ArrayList<>();

        // Adicionando produtos no formato "YYYY-MM-DD - Nome"
        estoque.add("2026-10-15 - Iogurte Morango");
        estoque.add("2026-08-01 - Leite Integral"); // Este vence primeiro
        estoque.add("2026-12-20 - Queijo Prato");
        estoque.add("2022-12-20 - Bife");

        System.out.println("Estoque antes da organização: \n" + estoque);

        // Ordena a lista alfabeticamente.
        // Como a data está no formato YYYY-MM-DD no início da string,
        // as datas mais próximas do vencimento ficarão no índice 0.
        Collections.sort(estoque);

        System.out.println("\nEstoque organizado por validade: \n" + estoque);

        // Removendo no padrão FEFO (O que vence antes, sai antes)
        String produtoVendido = estoque.remove(0);

        System.out.println("\nProduto vendido (vencia antes): " + produtoVendido);
        System.out.println("Estoque atualizado: " + estoque);
    }
}