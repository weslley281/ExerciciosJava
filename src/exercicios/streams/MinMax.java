package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fulano", 7.1);
        Aluno aluno2 = new Aluno("Cicrano", 6.5);
        Aluno aluno3 = new Aluno("Deltrano", 8.1);
        Aluno aluno4 = new Aluno("Maltrano", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Comparator<Aluno> melhorNota = (a1, a2) -> {
            if (a1.nota > a2.nota) return 1;
            if (a1.nota < a2.nota) return -2;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}

