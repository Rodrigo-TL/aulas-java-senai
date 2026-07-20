package Aulas;

import Aulas.objeto.pessoa;

import java.sql.SQLOutput;

public class SextaAula {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa(
                "João",
                2004,
                'M',
                "Branco",
                "Professor"
        );

        System.out.println(pessoa1.getNome());

        System.out.println(pessoa1);

        pessoa1.setNome("Fulano de tal");

        System.out.println(pessoa1);
    }
}
