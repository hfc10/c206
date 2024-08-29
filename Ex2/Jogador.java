public class Jogador {

    Arma arma;
    int energia;
    int vida;

    void Jogador(Arma arma, int energia, int vida){

        this.arma = arma;
        this.energia = energia;
        this.vida = vida;

        System.out.println(" Energia: " + energia + " Vida: " + vida);

    }

    void atacar(Jogador alvo){

        if(energia >= arma.custoDeEnergia){
            energia -= arma.custoDeEnergia;
            alvo.vida -= arma.dano;

        }else{
            System.out.println("Não posso atacar: "
                    + arma.custoDeEnergia + " pois minha energia é: " + energia);
        }

    }



    @Override
    public String toString() {
        return "Jogador{" +
                "Dano da arma = " + arma.dano +
                ", energia = " + energia +
                ", vida = " + vida +
                '}';
    }
}
