package teste.heranca;

public class Animal {
    protected String nome;
    protected String barulho;
    public Animal(String nome, String barulho){
        this.nome = nome;
        this.barulho = barulho;
    }

    public void fazerBarulho(){
        System.out.println("O animal " + nome + " fez " + barulho);
    }

    public String toString(){
        return nome;
    }
}
