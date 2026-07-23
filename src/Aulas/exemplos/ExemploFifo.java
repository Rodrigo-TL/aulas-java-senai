package Aulas.exemplos;

import com.sun.security.jgss.GSSUtil;

import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;

public class ExemploFifo {
    public static void main(String[] args) {
        ArrayList<String> fila = new ArrayList<>();

        fila.add("Paciente 1");
        fila.add("Paciente 2");
        fila.add("Paciente 3");
        fila.add("Paciente 4");
        fila.add("Paciente 5");

        System.out.println("Todos os pacientes na fila: ");
        System.out.println(fila);

        System.out.println("O paciente "+fila.get(0)+" Foi atendido.");
        System.out.println("Removendo ele da fila...");
        fila.remove(0);

        System.out.println("Todos os pacientes na espera agora:");
        System.out.println(fila);
    }
}