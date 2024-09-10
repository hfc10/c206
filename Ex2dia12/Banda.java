public class Banda {

    private Musica[] musicas;
    private String nome;
    private int numeroDeIntegrantes;

    public Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
        this.musicas = new Musica[100];

    }

    void mostrainfoBanda(){

            System.out.println("Nome: " + nome + " Numero de integrantes: " + numeroDeIntegrantes);

    }


    void tocarMusica(int posicao){

        System.out.println("Tocando: " + musicas[posicao].toString());

    }

    void tocarShow(){
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] != null){
                System.out.println(musicas[i].toString());
            }
        }
    }



    boolean adicionarMusica(Musica musica){
       for(int i = 0; i < musicas.length; i++){
           if(musicas[i] == null){
               musicas[i] = musica;
               break;
           }
       }

       return true;
    }

    boolean deletarMusica(String nome){

        for(int i = 0; i < musicas.length; i++){
            if(musicas[i].getNome().equals(nome)){
                musicas[i] = null;
                break;
            }
        }

        return true;
    }


}
