package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(98);

        Arroz arroz = new Arroz(0.25);
        Feijao feijao = new Feijao(0.2);
        Sorvete sorvete = new Sorvete(0.300);

        convidado.comer(arroz);
        convidado.comer(feijao);

        System.out.println(convidado.getPeso());

        convidado.comer(sorvete);

        System.out.println(convidado.getPeso());
    }
}
