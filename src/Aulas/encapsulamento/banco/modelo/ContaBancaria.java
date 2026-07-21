package Aulas.encapsulamento.banco.modelo;

public class ContaBancaria {

    private String titular;
    private int numeroDaConta;
    private double saldo;

    private static int contadorContas = 1000;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.numeroDaConta = contadorContas;
        contadorContas++;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor + " foi depositado");
        } else {
            System.out.println("Erro: valor inválido");
        }
    }

    public void sacar(double valor){

        if (valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println(valor + " foi retirado da conta");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido");
        }
    }

    private String acessarTodosOsDados(){
        return this.titular;
    }
}
