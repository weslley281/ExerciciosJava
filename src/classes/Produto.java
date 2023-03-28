package classes;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String Nome, double Preco, double Desconto){
        nome = Nome;
        preco = Preco;
        desconto = Desconto;
    }

    Produto(){

    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
