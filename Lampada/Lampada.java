package exercicios.Lampada;

public class Lampada {

    //variavel que guarda o estado da lampada
    private boolean estadoatual;
    private int potencia;

    //contrutor: define o estado da lampada quando criada e define a potencia
    public Lampada(boolean estadoInicial, int potenciaInicial){
        estadoatual = estadoInicial;
        potencia = potenciaInicial;
    }


    public void mostrarPotencia (){
        System.out.println(this.potencia + "W");
    }

    // Metodo para trocar o estado da lampada
    public void interruptor (boolean estadoatual){
         this.estadoatual = estadoatual;
    }

    // Metodo para exibir o estado
    public void mostraEstado(){
        if(estadoatual){
            System.out.println("A lampada esta acesa!");
        }
        else{
            System.out.println("A lampada esta apagada!");
        }
    }

}
