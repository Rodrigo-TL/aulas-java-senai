package Aulas;

import java.util.Scanner;

public class QuartaAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite = entrada.nextInt();
        entrada.nextLine();

        int repeticoes = 0;
        while (repeticoes <= limite){
            System.out.println(repeticoes);
            repeticoes++;
        }

        char simbolo = '#';

        for (int x=0;x<10;x++){
            for (int y=0;y<10;y++){
                System.out.print(simbolo+" ");
            }
            System.out.print("\n"+simbolo+" ");
        }
    }
}