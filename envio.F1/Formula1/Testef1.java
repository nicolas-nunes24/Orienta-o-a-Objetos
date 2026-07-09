package Formula1;

public class Testef1 {
    public static void main(String[] args) {
        Patrocinadores p1 = new Patrocinadores("Monkey",500000);
        Patrocinadores p2 = new Patrocinadores("super monkey", 100000);
        Patrocinadores[] lista = {p1,p2};

        Piloto piloto = new Piloto("Nicolas",18,"Nigerian",10);

        Carro carro = new Carro(12,2,"MClaren",piloto);

        Equipe equipe = new Equipe("MClaren",1943,lista);

        Engenheiro engenheiro = new Engenheiro("Pedro",17,"Mexicano",piloto);


        System.out.println("--- Dados do Carro ---");
        System.out.println("posicao: " + carro.posicao);
        System.out.println("Número: " + carro.num);
        System.out.println("Equipe: " + carro.equipe); // Caso tenha esse atributo


        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Idade: " + piloto.idade);
        System.out.println("Nacionalidade do Piloto: " + piloto.nacionalidade);
        System.out.println("Numero de vitorias: " + piloto.getNumVitoria());
    }
}
