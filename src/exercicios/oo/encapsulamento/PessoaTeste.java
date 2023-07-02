package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1  = new Pessoa(50, "Weslley", "Ferraz");
        pessoa1.setIdade(-32);

        if (pessoa1.getIdade() == -1){
            System.out.println("Idade Inválida " + pessoa1.getNome());
        }else {
            System.out.println(pessoa1.getIdade() + " " + pessoa1.getNome());
        }

        System.out.println(pessoa1.toString());
    }
}
