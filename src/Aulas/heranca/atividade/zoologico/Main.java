package Aulas.heranca.atividade.zoologico;

import Aulas.heranca.atividade.zoologico.AraraAzul;
import Aulas.heranca.atividade.zoologico.LoboGuara;

public class Main {
    public static void main(String[] args) {
        // Criando as instâncias (Objetos)
        LoboGuara lobo = new LoboGuara("Chico", 30.0, "Cerrado", 5);
        AraraAzul arara = new AraraAzul("Blue", 1.2, "Aves", 0.9);

        // Chamando os métodos e gerando as saídas esperadas
        lobo.emitirSom();
        arara.comer();
    }
}
