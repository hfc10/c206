import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // NÃO SEI O MOTIVO DO TIPO LONG ESTAR DANDO ERRO COM MAIS DE 10 DIGITOS PELA MINHA PESQUISA ELE SUPORTA ATE 19
        System.out.println("Entre com seu nome e seu CPF (CPF até 10 digitos)");

        Cliente cliente1 = new Cliente(entrada.nextLine(), entrada.nextInt());

        System.out.println("BEM VINDO A LOJA ");
        System.out.println("A loja possui 3 promoções, caso deseje comprar alguma digite o numero correspondente da promoção ");
        System.out.println("Depois de realizar a compra aperte 0 para sair \n ");

        System.out.println("Promoção 1" + "                                    Promoção 2" + "                                Promoção 3 \n");
        System.out.println("Marca: Positivo" + "                               Marca: Acer" + "                               Marca: Vaio");
        System.out.println("Preço R$: 1888" + "                                Preço R$: 3122" + "                            Preço R$: 5566");
        System.out.println("Pentium Core i3 (2200 Mhz)" + "                    Pentium Core i5 (3370 Mhz)" + "                Pentium Core i7 (4500 Mhz)");
        System.out.println("8 Gb de Memoria RAM" + "                           16 Gb de Memoria RAM" + "                      32 Gb de Memoria RAM");
        System.out.println("500 Gb de HD" + "                                  1 Tb de HD" + "                                2 Tb de HD");
        System.out.println("Sistema Operacional Linux Ubuntu (32 bits)" + "    Sistema Operacional Windows 8 (64 bits)" + "   Sistema Operacional Windows 10 (64 bits)");
        System.out.println("Acompanha Pen-drive de 16 Gb" + "                  Acompanha Pen-drive de 32 Gb" + "              Acompanha HD Externo 1 Tb");

        int numEntrada;

        do {

            numEntrada = entrada.nextInt();

            if (numEntrada == 1) {

                Computador promocao1 = new Computador();
                promocao1.marca = "Positivo";
                promocao1.preco = 1888;
                promocao1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));
                promocao1.sistemaOperacional.nome = "Linux Ubuntu";
                promocao1.sistemaOperacional.tipo = 32;
                promocao1.addHardware(new HardwareBasico("Pentium Core i3", 2200));
                promocao1.addHardware(new HardwareBasico("Memoria RAM", 8));
                promocao1.addHardware(new HardwareBasico("HD", 500));

                System.out.println("Comprou a Promoção 1");

                cliente1.addComputador(promocao1);

            }
            if (numEntrada == 2) {

                Computador promocao2 = new Computador();
                promocao2.marca = "Acer";
                promocao2.preco = 3122;
                promocao2.addMemoriaUSB(new MemoriaUSB("Pendrive", 32));
                promocao2.sistemaOperacional.nome = "Windows 8";
                promocao2.sistemaOperacional.tipo = 64;
                promocao2.addHardware(new HardwareBasico("Pentium Core i5", 3370));
                promocao2.addHardware(new HardwareBasico("Memoria RAM", 16));
                promocao2.addHardware(new HardwareBasico("HD", 1000));

                System.out.println("Comprou a Promoção 2");

                cliente1.addComputador(promocao2);
            }
            if (numEntrada == 3) {

                Computador promocao3 = new Computador();
                promocao3.marca = "Vaio";
                promocao3.preco = 5566;
                promocao3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
                promocao3.sistemaOperacional.nome = "Windows 10";
                promocao3.sistemaOperacional.tipo = 64;
                promocao3.addHardware(new HardwareBasico("Pentium Core i7", 4500));
                promocao3.addHardware(new HardwareBasico("Memoria RAM", 32));
                promocao3.addHardware(new HardwareBasico("HD", 2000));

                System.out.println("Comprou a promoçao 3");

                cliente1.addComputador(promocao3);

            }
            if (numEntrada > 3) {
                System.out.println("Numero inválido, digite o numero de uma promoção existente");
            }

        } while (numEntrada != 0);

        cliente1.clienteInfo();

        for (int i = 0; i < cliente1.compComprado.length; i++) {
            if (cliente1.compComprado[i] != null) {

                System.out.println("ESPECIFICAÇÕES DO COMPUTADOR COMPRADO: ");
                cliente1.compComprado[i].mostraPCConfig();
            }
        }

        System.out.println("Valor Total: " + cliente1.calculaTotalCompra());

    }
}
