public class Musica {

    private String nome;
    private String album;

    public Musica(String nome, String album) {
        this.nome = nome;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return
                "nome ='" + nome + '\'' +
                ", album ='" + album + '\'' +
                '}';
    }
}
