package Formula1;

public class Patrocinadores {
    private String nome;
    private int valorPatrocinio;

    public Patrocinadores(String nome, int valorPatrocinio){
        this.nome = nome;
        this.valorPatrocinio = valorPatrocinio;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(int valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
}
