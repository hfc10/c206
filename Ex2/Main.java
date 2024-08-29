
public class Main {
    public static void main(String[] args) {

         Jogador jogador1 = new Jogador();
         Jogador jogador2 = new Jogador();

         jogador1.energia = 10;
         jogador1.vida = 8;

         jogador2.energia = 5;
         jogador2.vida = 6;


        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.dano = 4;
        arma1.custoDeEnergia = 2;

        arma2.dano = 8;
        arma2.custoDeEnergia = 4;

        jogador1.arma = arma1;
        jogador2.arma = arma2;
        

        jogador1.arma.Arma(arma1.dano, arma1.custoDeEnergia);
        jogador2.arma.Arma(arma2.dano, arma2.custoDeEnergia);

        jogador2.atacar(jogador1);

        System.out.println(jogador2);
        System.out.println(jogador1);













    }
}