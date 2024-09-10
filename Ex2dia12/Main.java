//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Banda banda1 = new Banda("Queens",5);
        Banda banda2 = new Banda("Rock",5);

        banda1.adicionarMusica(new Musica("Musica 1", "Album 2"));
        banda1.adicionarMusica(new Musica("Musica 2", "Album 2"));
        banda1.adicionarMusica(new Musica("Musica 3", "Album 3"));

        banda2.adicionarMusica(new Musica("Musica 4", "Album 4"));
        banda2.adicionarMusica(new Musica("Musica 5", "Album 4"));

        banda1.tocarMusica(2);
        banda2.tocarMusica(1);

        banda1.deletarMusica("Musica 2");
        banda2.deletarMusica("Musica 5");

        banda1.tocarShow();
        banda2.tocarShow();

        banda1.mostrainfoBanda();
        banda2.mostrainfoBanda();





        }
    }
