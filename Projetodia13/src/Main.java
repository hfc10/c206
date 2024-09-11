import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        Cliente cliente1 = new Cliente();

        cliente1.nome = "Pedro";
        cliente1.cpf = 1234563411;

        Computador promocao1 = new Computador();
        promocao1.marca = "Positivo";
        promocao1.preco = 1888;
        promocao1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));
        promocao1.sistemaOperacional.nome = "Linux Ubuntu";
        promocao1.sistemaOperacional.tipo = 32;
        promocao1.addHardware(new HardwareBasico("Pentium Core i3", 2200));
        promocao1.addHardware(new HardwareBasico("Memoria RAM", 8));
        promocao1.addHardware(new HardwareBasico("HD", 500));


        Computador promocao2 = new Computador();
        promocao2.marca = "Acer";
        promocao2.preco = 3122;
        promocao2.addMemoriaUSB(new MemoriaUSB("Pendrive", 32));
        promocao2.sistemaOperacional.nome = "Windows 8";
        promocao2.sistemaOperacional.tipo = 64;
        promocao2.addHardware(new HardwareBasico("Pentium Core i5", 3370));
        promocao2.addHardware(new HardwareBasico("Memoria RAM", 16));
        promocao2.addHardware(new HardwareBasico("HD", 1000));


        Computador promocao3 = new Computador();
        promocao3.marca = "Vaio";
        promocao3.preco = 5566;
        promocao3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
        promocao3.sistemaOperacional.nome = "Windows 10";
        promocao3.sistemaOperacional.tipo = 64;
        promocao3.addHardware(new HardwareBasico("Pentium Core i7", 4500));
        promocao3.addHardware(new HardwareBasico("Memoria RAM", 32));
        promocao3.addHardware(new HardwareBasico("HD", 2000));



        while(entrada.nextInt() != 0){

            entrada.nextInt();

        }


        cliente1.clienteInfo();
        promocao1.mostraPCConfig();
        cliente1.calculaTotalCompra();




        }
    }
