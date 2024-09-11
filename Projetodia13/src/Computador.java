public class Computador {

    String marca;
    float preco;

    MemoriaUSB memoriaUSB;
    HardwareBasico[] hardware;
    SistemaOperacional sistemaOperacional;


    public Computador() {

        hardware = new HardwareBasico[4];
        sistemaOperacional = new SistemaOperacional();

    }

    void addHardware(HardwareBasico hardware1) {

        for (int i = 0; i < hardware.length; i++) {
            if (hardware[i] == null) {
                hardware[i] = hardware1;
                break;
            }
        }
    }

    void mostraPCConfig() {

        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);

        for (int i = 0; i < hardware.length; i++) {
            if (hardware[i] != null) {
                System.out.println(hardware[i].nome + " " + hardware[i].capacidade);
            }
        }

        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " " + sistemaOperacional.tipo);
        System.out.println("Acompanha: " + memoriaUSB.nome + " " + memoriaUSB.capacidade);
    }

    void addMemoriaUSB(MemoriaUSB musb) {
        memoriaUSB = musb;
    }
}
