public class Autor {

    String nome;

    Saga[] sagas = new Saga[180];

    void listarSagas(){

        for(int i = 0; i < sagas.length; i++){
            if(sagas[i] != null){

                System.out.print(" Nome do autor: " + nome + " " + sagas[i].livros[i].titulo + " Paginas: " + sagas[i].livros[i].paginas + " Nota da Saga: " + sagas[i].nota);

            }
        }

    }

    void adicionarSaga(Saga saga){

        for (int i = 0; i < sagas.length; i++){
            if (sagas[i]== null){
                sagas[i] = saga;
                break;
            }

        }

    }

}
