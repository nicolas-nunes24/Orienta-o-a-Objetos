package Formula1;

public class Engenheiro extends Pessoa {
    public Piloto piloto;

    public Engenheiro(String nome, int idade, String nacionalidade, Piloto piloto){
        super(nome, idade, nacionalidade);
        this.piloto = piloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
