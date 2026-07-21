package Aulas.encapsulamento.banco.principal;

import Aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Primeira conta

        ContaBancaria minhaConta = new ContaBancaria("Felipe");
        minhaConta.depositar(100);
        System.out.println("Titular: " + minhaConta.getTitular() + " | Conta: " + minhaConta.getNumeroDaConta() + " | Saldo: R$ " + minhaConta.getSaldo());

        System.out.println("--------------------------------------------------");

       //segunda conta
        ContaBancaria pessoa1 = new ContaBancaria("Fulano");
        System.out.println("Titular: " + pessoa1.getTitular() + " | Conta: " + pessoa1.getNumeroDaConta() + " | Saldo: R$ " + pessoa1.getSaldo());

        System.out.println("--------------------------------------------------");

        //terceira conta
        ContaBancaria pessoa2 = new ContaBancaria("Robson");
        System.out.println("Titular: " + pessoa2.getTitular() + " | Conta: " + pessoa2.getNumeroDaConta() + " | Saldo: R$ " + pessoa2.getSaldo());
    }
}

/**
 * ATIVIDADE
 *
 * 1. Quando instanciar a classe, o usuário deve somente inserir seu nome
 * 2. O usuário não poderá mais modificar o próprio nome depois de instancia-lo na classe principal (cria o nome, não pode alterar)
 * 3. Toda vez que uma instância dessa classe for criada, ou seja, quando criar um objeto com o new, o número de conta deve ser diferente da instância anterior.
 *    OBS: essa lógica deve ser inserida na classe de ContaBancaria
 */