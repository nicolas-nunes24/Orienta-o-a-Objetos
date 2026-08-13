package Estudante;

import java.util.Scanner;

public class Estudante {
    //atributos Privados
private String nome;
private Double[] notas;

public Estudante(String nome,Double[] notas){
  this.nome = nome;
  this.notas = notas;
}
 //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public Double lernotas(Double[] notas){
    Scanner scanner = new Scanner(System.in);

    return 0.0;
    }
}
