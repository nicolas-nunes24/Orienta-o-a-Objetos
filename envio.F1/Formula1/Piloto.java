package Formula1;

public class Piloto extends Pessoa {
    private int numVitoria;

    public Piloto(String nome, int idade, String nacionalidade, int numVitoria){
        super(nome, idade, nacionalidade);
        this.numVitoria = numVitoria;
    }

    public int getNumVitoria() {
        return numVitoria;
    }

    public void setNumVitoria(int numVitoria) {
        this.numVitoria = numVitoria;
    }
}
