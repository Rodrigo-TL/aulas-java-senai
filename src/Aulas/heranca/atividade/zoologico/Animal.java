package Aulas.heranca.atividade.zoologico;

public class Animal {
    // Atributos encapsulados (privados)
    private String nome;
    private double peso;
    private String setorNoZoo;

    // Construtor da classe mãe
    public Animal(String nome, double peso, String setorNoZoo) {
        this.nome = nome;
        this.peso = peso;
        this.setorNoZoo = setorNoZoo;
    }

    // Métodos que serão sobrescritos pelas classes filhas
    public void emitirSom() {
        System.out.println("O animal está emitindo um som genérico.");
    }

    public void comer() {
        System.out.println("O animal está comendo.");
    }

    // Getters e Setters (Encapsulamento)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getSetorNoZoo() { return setorNoZoo; }
    public void setSetorNoZoo(String setorNoZoo) { this.setorNoZoo = setorNoZoo; }
}
