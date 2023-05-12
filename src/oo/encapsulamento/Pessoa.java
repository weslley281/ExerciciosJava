package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    private String sobrenome;
    public Pessoa(int idade, String nome, String sobrenome){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if (idade <= 0){
            this.idade = -1;
        } else if (idade >= 200) {
            this.idade = -1;
        } else {
            this.idade = idade;
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        if (getIdade() == -1){
            setIdade(0);
        }
        return getNome() + " " + getSobrenome() + " tem " + getIdade() + " anos";
    }
}
