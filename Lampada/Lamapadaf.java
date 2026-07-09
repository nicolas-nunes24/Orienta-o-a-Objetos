package exercicios.Lampada;

import java.util.Scanner;

public class Lamapadaf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada minhalampada = new Lampada(true, 60);//criaçao do objeto lampada

        minhalampada.mostraEstado();//mostra o estado atual da lampada

        // Pede o estado para o usuário
        System.out.println("Digite True para ligar ou False para desligar a lampada: ");
        boolean estadoatual = scanner.nextBoolean();

        // Chama o metodo interruptor passando o que o usuário digitou
        minhalampada.interruptor(estadoatual);

        // Mostra o estado da lâmpada após a ação do usuário
        System.out.println("Estado atualizado : ");
        minhalampada.mostraEstado();

        System.out.println("Potencia da lampada: ");
        minhalampada.mostrarPotencia();
    }
}
