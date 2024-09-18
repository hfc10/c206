public class Main {
    public static void main(String[] args) {

        Produto[] lista = new Produto[3];

        Produto produto = new Produto("teste", 150);
        Produto camiseta = new Camiseta("teste1", 152, "azul", "g");
        Produto computador = new Notebook("Predator", 16000, 16,  "RTX 4090", "Core i9");


        lista[0] = produto;
        lista[1] = camiseta;
        lista[2] = computador;

        for (int i = 0; i < lista.length; i++) {

            if(lista[i] instanceof Notebook) {
                System.out.println("Notebook: " + lista[i].etiquetaPreco());
            } else if(lista[i] instanceof Camiseta) {
                System.out.println("Camiseta: " + lista[i].etiquetaPreco());
            } else {
                System.out.println("Produto: " + lista[i].etiquetaPreco());
            }
        }

    }
}