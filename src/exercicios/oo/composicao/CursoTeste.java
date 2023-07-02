package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fulano");
        Aluno aluno2 = new Aluno("Cicrano");
        Aluno aluno3 = new Aluno("Beltrano");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Typescript");
        Curso curso3 = new Curso("Python");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adcionarCurso(curso3);
        aluno2.adcionarCurso(curso3);
        aluno3.adcionarCurso(curso3);

        for (Aluno aluno: curso1.alunos){
            System.out.println("O aluno " + aluno.nome + " está matriculado em " + curso1.nome);
        }

        for (Aluno aluno: curso3.alunos){
            System.out.println("O aluno " + aluno.nome + " está matriculado em " + curso3.nome);
        }

        for (Aluno aluno: curso2.alunos){
            System.out.println("O aluno " + aluno.nome + " está matriculado em " + curso2.nome);
        }

        Curso temCurso = aluno1.obterCursoPorNome("Java");

        if (temCurso !=null){
            System.out.println(temCurso.nome);
            System.out.println(temCurso.alunos);
        }
    }
}
