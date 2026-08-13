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
 //metodos

    public void lernotas(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do estudante: " + this.nome);

    for(int i=0; i<5;i++){
        System.out.println("Insira a nota " + (i+1) + ": ");
        this.notas[i] = scanner.nextDouble();// Lê o número e guarda na posição 'i' do array
    }
    }

    public double calcularmedia(double media){

        double soma= 0.0;

        for(int i=0; i<5;i++){
            soma += this.notas[i];
        }

    media= soma / 5;

    return media;
    }

    public String getNome() {
        return nome;
    }

    public Double[] getNotas() {
        return notas;
    }

    public double menornota(){

    double menor=this.notas[0];

        for (int i = 0; i < 5; i++) {
            if(this.notas[i]<menor) {
                menor = this.notas[i];
            }
        }

    return menor;
    }

    

}
