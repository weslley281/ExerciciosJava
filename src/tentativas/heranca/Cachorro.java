package tentativas.heranca;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome, "Auau");
    }

    public void fazerBarulho(){
        System.out.println("O cachorro " + super.nome + " fez " + barulho);
    }
}
