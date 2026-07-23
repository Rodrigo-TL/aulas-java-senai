package Aulas.exemplos;

import java.util.ArrayList;

public class ExemploLifo {
    public static void main(String[] args) {
        ArrayList<String> pilhaDePratos = new ArrayList<>();

        pilhaDePratos.add("Primeiro prato");//0
        pilhaDePratos.add("Segundo prato");//1
        pilhaDePratos.add("Terceiro prato");//2

        System.out.println(pilhaDePratos);

        pilhaDePratos.remove(pilhaDePratos.size()-1);

        System.out.println(pilhaDePratos);
    }
}