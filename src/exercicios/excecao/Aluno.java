package excecao;

public class Aluno {
    public String nome;
    public final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString(){
        return nome + "tem nota" + nota;
    }
}
