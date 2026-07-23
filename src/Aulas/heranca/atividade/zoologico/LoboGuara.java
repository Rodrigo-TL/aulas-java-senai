package Aulas.heranca.atividade.zoologico;

import Aulas.heranca.atividade.zoologico.Animal;

public class LoboGuara extends Animal {
    // Atributo exclusivo
    private int quantidadeAlcateia;

    // Construtor puxando os dados da classe mãe com o 'super'
    public LoboGuara(String nome, double peso, String setorNoZoo, int quantidadeAlcateia) {
        super(nome, peso, setorNoZoo);
        this.quantidadeAlcateia = quantidadeAlcateia;
    }

    // Sobrescrita do método emitirSom conforme o enunciado
    @Override
    public void emitirSom() {
        System.out.println("O Lobo Guará está uivando no cerrado!");
    }

    // Método exclusivo do Lobo
    public void correrPeloCerrado() {
        System.out.println(getNome() + " está correndo pelas vegetações do Zoo.");
    }

    // Getter e Setter do atributo exclusivo
    public int getQuantidadeAlcateia() { return quantidadeAlcateia; }
    public void setQuantidadeAlcateia(int quantidadeAlcateia) { this.quantidadeAlcateia = quantidadeAlcateia; }
}
