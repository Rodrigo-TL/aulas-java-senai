package Aulas.encapsulamento.banco.principal;

import Aulas.encapsulamento.banco.modelo.ContaBancaria;

/**
 * ATIVIDADE
 *
 * 1. Quando instanciar a classe, o usuário deve somente inserir seu nome
 * 2. O usuário não poderá mais modificar o próprio nome depois de instancia-lo na classe principal (cria o nome, não pode alterar)
 * 3. Toda vez que uma instância dessa classe for criada, ou seja, quando criar um objeto com o new, o número de conta deve ser diferente da instância anterior.
 *    OBS: essa lógica deve ser inserida na classe de ContaBancaria
 */
public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Fulano", 123456);
        minhaConta.setTitular("Felipe");
        System.out.println(minhaConta.getTitular());

        minhaConta.deposistar(100);

        ContaBancaria pessoa1 = new ContaBancaria("Fulano");
        ContaBancaria pessoa2 = new ContaBancaria("Robso");
    }
}