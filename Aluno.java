import java.util.Scanner;

public class Aluno {

    int matricula;
    int np1;
    int np2;
    int periodo;
    String nome;

    int calculaMedia(){

        int media = (np1 + np2)/2;

        if(media >= 60){
            System.out.println("Aprovado");
        }

        else if(media < 60){

            media = calculaNP3(media);

            if(media >= 50){
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }
        }

        return media;

    }

    int calculaNP3(int media){

        int resultado;
        Scanner entrada = new Scanner(System.in);

        resultado = entrada.nextInt();


       return (resultado + media)/2;

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Matricula: " + matricula +
                ", Np1: " + np1 +
                ", Np2: " + np2 +
                ", Periodo: " + periodo +
                ", Nome: " + nome + '\'' +
                '}';
    }

}
