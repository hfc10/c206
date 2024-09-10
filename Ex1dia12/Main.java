//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Calculadora.PI = 3.14;

         Calculadora calculadora = new Calculadora();

         System.out.println(calculadora.circunferencia(5.2));
         System.out.println(calculadora.volumeCilindro(5.2,10.1));
         System.out.println(calculadora.volumeEsfera(5.2));

        }
    }
