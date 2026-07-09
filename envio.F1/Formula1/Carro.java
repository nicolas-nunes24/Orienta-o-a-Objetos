package Formula1;

public class Carro {
    public int num;
    public int posicao;
    public String equipe;
    public Piloto piloto;

    public Carro(int num, int posicao, String equipe, Piloto piloto){
        this.num = num;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
