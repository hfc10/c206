public class Cliente {

    String nome;
    long cpf;

    Computador[] compComprado;


    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;

        compComprado = new Computador[40];

    }

    void addComputador(Computador comprado) {

        for (int i = 0; i < compComprado.length; i++) {
            if (compComprado[i] == null) {
                compComprado[i] = comprado;
                break;
            }
        }
    }

    float calculaTotalCompra() {

        float resultado = 0;

        for (int i = 0; i < compComprado.length; i++) {

            if (compComprado[i] != null) {

                resultado += compComprado[i].preco;
            }

        }

        return resultado;

    }

    void clienteInfo() {

        System.out.println("Nome: " + nome + "\nCPF: " + cpf);
    }
}

