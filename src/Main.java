//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          Livro livro = new Livro();
          Livro livro2 = new Livro();
          Livro livro3 = new Livro();
          Livro livro4 = new Livro();

          livro.titulo = "Livro 1";
          livro2.titulo = "Livro 2";
          livro3.titulo = "Livro 3";
          livro4.titulo = "Livro 4";

          livro.paginas = 200;
          livro2.paginas = 250;
          livro3.paginas = 300;
          livro4.paginas = 400;

          Saga saga1= new Saga();
          Saga saga2= new Saga();

          saga1.nota = 8;
          saga2.nota = 7;

          saga1.adicionarLivro(livro);
          saga1.adicionarLivro(livro2);

          saga2.adicionarLivro(livro3);
          saga2.adicionarLivro(livro4);

          saga1.listarLivros();


         Autor autor1 = new Autor();
         Autor autor2 = new Autor();

         autor1.nome = "Joao";
         autor2.nome = "Jose";

         autor1.adicionarSaga(saga1);
         autor2.adicionarSaga(saga2);

         autor1.listarSagas();








    }
}