public class Calculadora {

    public static double PI;


    double circunferencia(double raio){

        return 2 * PI * raio;
    }

    double volumeCilindro(double raio, double altura){

        return PI * Math.pow(raio, 2) * altura;
    }

    double volumeEsfera(double raio){

        return (double) 4 / 3 * PI * Math.pow(raio, 2);
    }
}
