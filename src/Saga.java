public class Saga {

    int nota;
    Livro[] livros = new Livro[180];

    void listarLivros(){

        for (int i = 0; i < livros.length; i++){
            if(livros[i] != null){
                System.out.println(livros[i].titulo);
                System.out.println(livros[i].paginas);
            }
        }

    }

    void adicionarLivro(Livro livro){

        for(int i = 0; i < livros.length; i++){
            if(livros[i] == null){
                livros[i] = livro;
                break;
            }
        }

    }
}
