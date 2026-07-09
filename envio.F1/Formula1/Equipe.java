package Formula1;

public class Equipe {
    public String nome;
    public int anoCriacao;
    public Patrocinadores[] patrocinadores;

    public Equipe(String nome, int anoCriacao, Patrocinadores[] patrocinadores){
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.patrocinadores = patrocinadores;
    }

}
