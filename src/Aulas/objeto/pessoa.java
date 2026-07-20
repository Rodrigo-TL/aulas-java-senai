package Aulas.objeto;

public class pessoa {
    private String nome;
    private int anoNascimento;
    private char genero;
    private String cor;
    private String profissao;

    // Construtor que recebe todos os dados
    public pessoa(String nome, int anoNascimento, char genero, String cor, String profissao) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.genero = genero;
        this.cor = cor;
        this.profissao = profissao;
    }

    // Método Getter para o Nome
    public String getNome() {
        return nome;
    }

    // Método Setter para o Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para permitir imprimir o objeto na tela de forma organizada
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", genero=" + genero +
                ", cor='" + cor + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
