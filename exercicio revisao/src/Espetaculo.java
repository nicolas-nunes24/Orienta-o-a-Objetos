import java.util.ArrayList;

public class Espetaculo {

    private String nomeEspetaculo;

    private int[] plateiaBaixa;

    private int[] plateiaAlta;

    private int[] mezanino;

    private Double valorTotal;

    private Double valorIngressoBaixa;

    private int numeroIngresso;

    public Espetaculo(String nomeEspetaculo,Double valoringressobaixa, int numeroingresso  ){
        this.nomeEspetaculo = nomeEspetaculo;
        this.valorIngressoBaixa = valoringressobaixa;
        this.numeroIngresso = numeroingresso - 1;
        this.valorTotal = 0.0;
        this.plateiaBaixa = new int[251];
        this.plateiaAlta = new int[279];
        this.mezanino = new int[249];
    }

    
}
