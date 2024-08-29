public class Arma {

    int dano;
    int custoDeEnergia;

    void Arma(int dano, int custoDeEnergia) {

        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;

        System.out.println("Dano da arma: " + dano + " Custo de energia: " + custoDeEnergia);
    }
}
