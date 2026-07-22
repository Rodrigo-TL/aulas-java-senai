package Aulas.heranca.locomocao;

public class Main {
    public static void Main(String[] args) {

        Carro carro = new Carro ();
        Moto moto = new MotoACombustao ();

        carro.nomeVeiculo = "Celtinha";
        carro.ligar ();
        carro.ligarArCondicionado ();



    }
}
