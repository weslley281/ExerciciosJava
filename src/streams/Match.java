package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fulano", 7.1);
        Aluno aluno2 = new Aluno("Cicrano", 6.5);
        Aluno aluno3 = new Aluno("Deltrano", 8.1);
        Aluno aluno4 = new Aluno("Maltrano", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> aprovados = aprovado -> aprovado.nota >= 7;
        Predicate<Aluno> reprovados = aprovados.negate();

        System.out.println(alunos.stream().allMatch(aprovados));
        System.out.println(alunos.stream().anyMatch(aprovados));
        System.out.println(alunos.stream().noneMatch(reprovados));
    }
}
