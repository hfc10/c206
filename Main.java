import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.np1 = 30;
        aluno.np2 = 70;
        aluno.nome = "Pedro";
        aluno.matricula = 2;
        aluno.periodo = 5;

        aluno.calculaMedia();

            System.out.println(aluno);


    }
}