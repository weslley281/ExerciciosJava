package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {
    private Validar(){}

    public static void aluno(Aluno aluno) throws StringVaziaExcesao, NumeroForaIntervaloExcesao{
        if (aluno == null){
            throw new IllegalArgumentException("O aluno está nulo");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaExcesao("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervaloExcesao("nota");
        }
    }
}
