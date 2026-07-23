package Aulas.heranca.atividade.zoologico;

import Aulas.heranca.atividade.zoologico.Animal;

public class AraraAzul extends Animal {
    // Atributo exclusivo
    private double envergaduraAsas;

    // Construtor
    public AraraAzul(String nome, double peso, String setorNoZoo, double envergaduraAsas) {
        super(nome, peso, setorNoZoo);
        this.envergaduraAsas = envergaduraAsas;
    }

    // Sobrescrita do método comer conforme o enunciado
    @Override
    public void comer() {
        System.out.println("A Arara Azul está comendo sementes.");
    }

    // Método exclusivo da Arara
    public void voarNoViveiro() {
        System.out.println(getNome() + " está voando alto no setor de aves.");
    }

    // Getter e Setter do atributo exclusivo
    public double getEnvergaduraAsas() { return envergaduraAsas; }
    public void setEnvergaduraAsas(double envergaduraAsas) { this.envergaduraAsas = envergaduraAsas; }
}
