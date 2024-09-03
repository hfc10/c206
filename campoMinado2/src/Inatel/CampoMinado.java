package Inatel;

import java.util.Random;
import java.util.Scanner;

public class CampoMinado {

    Scanner entrada = new Scanner(System.in);
    int posicaoXJogador;
    int posicaoYJogador;

    boolean campoMinadoGrid[][] = new boolean[2][2];

    public CampoMinado() {

        Random rand = new Random();

        int posicaoMinaX = rand.nextInt(2);
        int posicaoMinaY = rand.nextInt(2);
        System.out.println("Bomba: "+posicaoMinaX + " - " +posicaoMinaY);

        campoMinadoGrid[posicaoMinaX][posicaoMinaY] = true;


        System.out.println("Bem vindo ao campo Minado");
    }

    void campoMinadoJogo(){

        for (int i = 0; i < campoMinadoGrid.length*2; i++){
            System.out.print("Digite uma posicao X: ");
            posicaoXJogador = entrada.nextInt();
            System.out.print("Digite uma posicao Y: ");
            posicaoYJogador = entrada.nextInt();
            if(campoMinadoGrid[posicaoXJogador][posicaoYJogador]){
                System.out.println("EXPLODIU!");
            }else{
                System.out.println("SAFE!");
            }
        }
        entrada.close();
    }

    void campoMinadoJogodwhile(boolean[][] campoMinado){

        int contador = 0;
        do {
            System.out.print("Digite uma posicao X: ");
            posicaoXJogador = entrada.nextInt();

            System.out.print("Digite uma posicao Y: ");
            posicaoYJogador = entrada.nextInt();

            if(campoMinado[posicaoXJogador][posicaoYJogador]){
                System.out.println("Opa acertou a mina");
                contador = 0;
            }else{
                System.out.println("Boa! Sem mina");
                contador++;
            }


        } while (contador < 3);

        entrada.close();
    }
}
