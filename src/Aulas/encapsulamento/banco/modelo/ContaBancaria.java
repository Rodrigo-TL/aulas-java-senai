package Aulas.encapsulamento.banco.modelo;

public class ContaBancaria {
    //Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;

    //Construtor dessa classe
    public ContaBancaria(String titular,int numeroDaConta){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    // é um metodo para pegar o valor dentro da instância da classe (no objeto)
    public String getTitular() {
        return titular;
    }

    // é um metodo para modificar o valor dentro da instância da classe (no objeto)
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // um metodo criado para modificar o valor do saldo de um objeto
    public void deposistar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor+" foi depositado");
        } else {
            System.out.println("Erro: valor inválido");
        }
    }

    // metodo para sacar o valor do .saldo do objeto
    public void sacar(double valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            System.out.println(valor+" foi retirado da conta");
        }
    }

    // metodos privados também só podem ser acessados dentro da classe que foram criado
    private String acessarTodosOsDados(){
        return this.titular;
    }
}